package com.kirinpatel.ddsss.utils;

import jdk.nashorn.api.scripting.URLReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

class PostPuller {

    static String getFacebookPost() {
        String post = "<div class=\"mdl-cell mdl-cell--12-col\"><iframe src=\"https://www.facebook.com/plugins/post.php?href=https%3A%2F%2Fwww.facebook.com%2FDirtDigglersSh1ttySportsShow%2Fposts%2F";
        final String[] identifiers = new String[] { "fwb", "/DirtDigglersSh1ttySportsShow/posts/" };
        try {
            Scanner s = new Scanner(new URLReader(new URL("https://www.facebook.com/pg/DirtDigglersSh1ttySportsShow/posts/")));
            while (s.hasNext()) {
                String currentLine = s.nextLine();
                if (currentLine.contains(identifiers[0])) {
                    currentLine = currentLine.substring(currentLine.indexOf(identifiers[0]));
                    currentLine = currentLine.substring(currentLine.indexOf(identifiers[1]));
                    currentLine = currentLine.substring(0, currentLine.indexOf('\"'));
                    currentLine = currentLine.substring(currentLine.lastIndexOf("/") + 1);
                    post += currentLine + "\" width=\"100%\" height=\"100%\" style=\"border:none;width:100%;\" scrolling=\"no\" frameborder=\"0\" allowTransparency=\"true\" onload=\"resizeIframe(this)\"></iframe></div>";
                    break;
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return post;
    }

    static String getTwitterPost() {
        String post = "<div class=\"mdl-cell mdl-cell--6-col\"><blockquote class=\"twitter-tweet\" data-cards=\"hidden\" data-lang=\"en\"><p lang=\"en\" dir=\"ltr\">";
        final String[] identifiers = new String[] { "data-conversation-id=\"", "<div class=\"js-tweet-text-container\">", "<span class=\"metadata\">" };
        try {
            String postID = "";
            Scanner s = new Scanner(new URLReader(new URL("https://twitter.com/DirtsDiggler")));
            while (s.hasNext()) {
                String currentLine = s.nextLine();
                if (currentLine.contains(identifiers[0])) {
                    postID = currentLine.substring(identifiers[0].length(), currentLine.length() - 1);
                    break;
                }
            }
            s = new Scanner(new URLReader(new URL("https://twitter.com/DirtsDiggler/status/" + postID)));
            while (s.hasNext()) {
                String currentLine = s.nextLine();
                if (currentLine.contains(identifiers[1])) {
                    currentLine = s.nextLine();
                    post += currentLine.substring(currentLine.indexOf('>') + 1, currentLine.length());
                }
                if (currentLine.contains(identifiers[2])) {
                    currentLine = s.nextLine();
                    String date = currentLine.substring(currentLine.indexOf("- " + 1), currentLine.lastIndexOf('<'));
                    post += " <a href=\"https://twitter.com/DirtsDiggler/status/" + postID + "\">" + date + "</a></blockquote></div>";
                    System.out.println(currentLine);
                    break;
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.println(post);
        return post;
    }
}
