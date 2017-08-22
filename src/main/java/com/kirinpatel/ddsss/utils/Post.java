package com.kirinpatel.ddsss.utils;

import jdk.nashorn.api.scripting.URLReader;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Post {

    private final String facebookURL = "https://www.facebook.com/pg/DirtDigglersSh1ttySportsShow/posts/";
    private final String twitterURL = "https://twitter.com/DirtsDiggler";
    private POST_TYPE type;
    private String html;

    public enum POST_TYPE {
        ERROR(0),
        FACEBOOK(1),
        TWITTER(2),
        INSTAGRAM(3),
        SOUNDCLOUD(4),
        MIXCLOUD(5);

        private int postId;

        POST_TYPE(int postId) {
            this.postId = postId;
        }

        public int getPostId() {
            return postId;
        }
    }

    Post(POST_TYPE type) {
        this.type = type;
        loadPost();
    }

    private void loadPost() {
        switch (type) {
            case ERROR:
                break;
            case FACEBOOK:
                setHtml("<div class=\"mdl-cell mdl-cell--12-col\"><iframe src=\"https://www.facebook.com/plugins/post.php?href=https%3A%2F%2Fwww.facebook.com%2FDirtDigglersSh1ttySportsShow%2Fposts%2F" + getFacebookPost() + "\" width=\"100%\" height=\"700\" style=\"border:none;width:100%;\" scrolling=\"no\" frameborder=\"0\" allowTransparency=\"true\" onload=\"resizeIframe(this)\"></iframe></div>");
                break;
            case TWITTER:
                setHtml("<div class=\"mdl-cell mdl-cell--6-col\"><blockquote class=\"twitter-tweet\" data-cards=\"hidden\" data-lang=\"en\"><p lang=\"en\" dir=\"ltr\">Uploaded &quot;Dirt Diggler&#39;s Shitty Sports Show Season 2 - Why Your Division Sucks: AFC Wes...&quot; to <a href=\"https://twitter.com/mixcloud\">@mixcloud</a> <a href=\"https://t.co/cTmCg3jgDg\">https://t.co/cTmCg3jgDg</a> listen now!</p>&mdash; Dirt Diggler2823 (@DirtsDiggler) <a href=\"https://twitter.com/DirtsDiggler/status/" + getTwitterPost() + "\">August 13, 2017</a></blockquote></div>");
                break;
            default:
                break;
        }
    }

    private void setHtml(String html) {
        this.html = html;
    }

    public POST_TYPE getType() {
        return type;
    }

    public String getHtml() {
        return html;
    }

    private String getFacebookPost() {
        String post = "506264903048330";
        final String identifier = "_4-u2 _4-u8";
        try {
            Scanner s = new Scanner(new URLReader(new URL(facebookURL)));
            while (s.hasNext()) {
                String currentLine = s.nextLine();
                if (currentLine.contains(identifier)) {
                    System.out.println("AAAAAsd\n" + currentLine);
                    String[] a = new String[]{ currentLine.substring(0, currentLine.indexOf(identifier)), currentLine.substring(currentLine.indexOf(identifier))};
                    System.out.println(a[0]);
                    System.out.println(a[1]);
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return post;
    }

    private String getTwitterPost() {
        String post = "896544238804119552";
        final String identifier = "stream";
        try {
            Scanner s = new Scanner(new URLReader(new URL(twitterURL)));
            while (s.hasNext()) {
                String currentLine = s.nextLine();
                if (currentLine.contains(identifier)) {

                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return post;
    }
}
