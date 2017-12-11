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
                    post += currentLine + "\" width=\"100%\" height=\"150%\" style=\"border:none; width:100%; height:150%; margin-bottom: 10%;\" scrolling=\"no\" frameborder=\"0\" allowTransparency=\"true\" onload=\"resizeIframe(this)\"></iframe></div>";
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
                    String date =  currentLine.substring(currentLine.indexOf("- ") + 1, currentLine.lastIndexOf('<'));
                    post += " <a href=\"https://twitter.com/DirtsDiggler/status/" + postID + "\">" + date + "</a></blockquote></div>";
                    break;
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return post;
    }

    static String getInstagramPost() {
        String post = "<blockquote class=\"instagram-media\" data-instgrm-captioned data-instgrm-version=\"7\" style=\" background:#FFF; border:0; border-radius:3px; box-shadow:0 0 1px 0 rgba(0,0,0,0.5),0 1px 10px 0 rgba(0,0,0,0.15); margin: 1px; max-width:658px; padding:0; width:99.375%; width:-webkit-calc(100% - 2px); width:calc(100% - 2px);\"><div style=\"padding:8px;\"> <div style=\" background:#F8F8F8; line-height:0; margin-top:40px; padding:50.0% 0; text-align:center; width:100%;\"> <div style=\" background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACwAAAAsCAMAAAApWqozAAAABGdBTUEAALGPC/xhBQAAAAFzUkdCAK7OHOkAAAAMUExURczMzPf399fX1+bm5mzY9AMAAADiSURBVDjLvZXbEsMgCES5/P8/t9FuRVCRmU73JWlzosgSIIZURCjo/ad+EQJJB4Hv8BFt+IDpQoCx1wjOSBFhh2XssxEIYn3ulI/6MNReE07UIWJEv8UEOWDS88LY97kqyTliJKKtuYBbruAyVh5wOHiXmpi5we58Ek028czwyuQdLKPG1Bkb4NnM+VeAnfHqn1k4+GPT6uGQcvu2h2OVuIf/gWUFyy8OWEpdyZSa3aVCqpVoVvzZZ2VTnn2wU8qzVjDDetO90GSy9mVLqtgYSy231MxrY6I2gGqjrTY0L8fxCxfCBbhWrsYYAAAAAElFTkSuQmCC); display:block; height:44px; margin:0 auto -44px; position:relative; top:-22px; width:44px;\"></div></div> <p style=\" margin:8px 0 0 0; padding:0 4px;\"> <a href=\"https://www.instagram.com/p/BYT1w5Lgct8/\" style=\" color:#000; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:normal; line-height:17px; text-decoration:none; word-wrap:break-word;\" target=\"_blank\">New studio setup!</a></p> <p style=\" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; line-height:17px; margin-bottom:0; margin-top:8px; overflow:hidden; padding:8px 0 7px; text-align:center; text-overflow:ellipsis; white-space:nowrap;\">A post shared by Dirt Diggler (@dirt.diggler2823) on <time style=\" font-family:Arial,sans-serif; font-size:14px; line-height:17px;\" datetime=\"2017-08-27T20:05:04+00:00\">Aug 27, 2017 at 1:05pm PDT</time></p></div></blockquote> <script async defer src=\"//platform.instagram.com/en_US/embeds.js\"></script>";
        final String[] identifiers = new String[] { "/p/" };
        try {
            String postID = "";
            Scanner s = new Scanner(new URLReader((new URL("https://www.instagram.com/dirt.diggler2823/"))));
            while (s.hasNext()) {
                String currentLine = s.nextLine();
                if (currentLine.contains(identifiers[0])) {
                    postID = currentLine.substring(currentLine.indexOf(identifiers[0]) + 3);
                    postID = postID.substring(0, postID.indexOf("/"));
                }
            }

            s = new Scanner(new URLReader(new URL("https://www.instagram.com/p/" + postID + "/")));
            while (s.hasNext()) {
                String currentLine = s.nextLine();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return post;
    }
}
