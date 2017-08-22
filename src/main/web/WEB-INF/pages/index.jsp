<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!doctype html>
<!--
Material Design Lite
Copyright 2015 Google Inc. All rights reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License

Credit for template: https://getmdl.io/templates/index.html
-->
<html lang="en">
<head>
    <%@ page isELIgnored="false" %>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="description" content="Dirt Diggler's Shitty Sports Show website.">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0">
    <title>Dirt Diggler's Shitty Sports Show</title>

    <meta name="mobile-web-app-capable" content="yes">

    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="Dirt Diggler's Shitty Sport Show">

    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:regular,bold,italic,thin,light,bolditalic,black,medium&amp;lang=en">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link rel="stylesheet" href="https://code.getmdl.io/1.3.0/material.blue_grey-green.min.css" />
    <style>
        /**
         * Copyright 2015 Google Inc. All Rights Reserved.
         *
         * Licensed under the Apache License, Version 2.0 (the "License");
         * you may not use this file except in compliance with the License.
         * You may obtain a copy of the License at
         *
         *      http://www.apache.org/licenses/LICENSE-2.0
         *
         * Unless required by applicable law or agreed to in writing, software
         * distributed under the License is distributed on an "AS IS" BASIS,
         * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
         * See the License for the specific language governing permissions and
         * limitations under the License.
         */

        html, body {
            font-family: 'Roboto', 'Helvetica', sans-serif;
            margin: 0;
            padding: 0;
        }
        .mdl-demo .mdl-layout__header-row {
            padding-left: 40px;
        }
        .mdl-demo .mdl-layout.is-small-screen .mdl-layout__header-row h3 {
            font-size: inherit;
        }
        .mdl-demo .mdl-layout__tab-bar-button {
            display: none;
        }
        .mdl-demo .mdl-layout.is-small-screen .mdl-layout__tab-bar .mdl-button {
            display: none;
        }
        .mdl-demo .mdl-layout:not(.is-small-screen) .mdl-layout__tab-bar,
        .mdl-demo .mdl-layout:not(.is-small-screen) .mdl-layout__tab-bar-container {
            overflow: visible;
        }
        .mdl-demo .mdl-layout__tab-bar-container {
            height: 64px;
        }
        .mdl-demo .mdl-layout__tab-bar {
            padding: 0;
            padding-left: 16px;
            box-sizing: border-box;
            height: 100%;
            width: 100%;
        }
        .mdl-demo .mdl-layout__tab-bar .mdl-layout__tab {
            height: 64px;
            line-height: 64px;
        }
        .mdl-demo .mdl-layout__tab-bar .mdl-layout__tab.is-active::after {
            background-color: white;
            height: 4px;
        }
        .mdl-demo main > .mdl-layout__tab-panel {
            padding: 8px;
            padding-top: 48px;
        }
        .mdl-demo .mdl-card {
            height: auto;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-flex-direction: column;
            -ms-flex-direction: column;
            flex-direction: column;
        }
        .mdl-demo .mdl-card > * {
            height: auto;
        }
        .mdl-demo .mdl-card .mdl-card__supporting-text {
            margin: 40px;
            -webkit-flex-grow: 1;
            -ms-flex-positive: 1;
            flex-grow: 1;
            padding: 0;
            color: inherit;
            width: calc(100% - 80px);
        }
        .mdl-demo.mdl-demo .mdl-card__supporting-text h4 {
            margin-top: 0;
            margin-bottom: 20px;
        }
        .mdl-demo .mdl-card__actions {
            margin: 0;
            padding: 4px 40px;
            color: inherit;
        }
        .mdl-demo .mdl-card__actions a {
            color: #00BCD4;
            margin: 0;
        }
        .mdl-demo .mdl-card__actions a:hover,
        .mdl-demo .mdl-card__actions a:active {
            color: inherit;
            background-color: transparent;
        }
        .mdl-demo .mdl-card__supporting-text + .mdl-card__actions {
            border-top: 1px solid rgba(0, 0, 0, 0.12);
        }
        .mdl-demo #add {
            position: absolute;
            right: 40px;
            top: 36px;
            z-index: 999;
        }

        .mdl-demo .mdl-layout__content section:not(:last-of-type) {
            position: relative;
            margin-bottom: 48px;
        }
        .mdl-demo section.section--center {
            max-width: 860px;
        }
        .mdl-demo #features section.section--center {
            max-width: 620px;
        }
        .mdl-demo section > header{
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-align-items: center;
            -ms-flex-align: center;
            align-items: center;
            -webkit-justify-content: center;
            -ms-flex-pack: center;
            justify-content: center;
        }
        .mdl-demo section > .section__play-btn {
            min-height: 200px;
        }
        .mdl-demo section > header > .material-icons {
            font-size: 3rem;
        }
        .mdl-demo section > button {
            position: absolute;
            z-index: 99;
            top: 8px;
            right: 8px;
        }
        .mdl-demo section .section__circle {
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-align-items: center;
            -ms-flex-align: center;
            align-items: center;
            -webkit-justify-content: flex-start;
            -ms-flex-pack: start;
            justify-content: flex-start;
            -webkit-flex-grow: 0;
            -ms-flex-positive: 0;
            flex-grow: 0;
            -webkit-flex-shrink: 1;
            -ms-flex-negative: 1;
            flex-shrink: 1;
        }
        .mdl-demo section .section__text {
            -webkit-flex-grow: 1;
            -ms-flex-positive: 1;
            flex-grow: 1;
            -webkit-flex-shrink: 0;
            -ms-flex-negative: 0;
            flex-shrink: 0;
            padding-top: 8px;
        }
        .mdl-demo section .section__text h5 {
            font-size: inherit;
            margin: 0;
            margin-bottom: 0.5em;
        }
        .mdl-demo section .section__text a {
            text-decoration: none;
        }
        .mdl-demo section .section__circle-container > .section__circle-container__circle {
            width: 64px;
            height: 64px;
            border-radius: 32px;
            margin: 8px 0;
        }
        .mdl-demo section.section--footer .section__circle--big {
            width: 100px;
            height: 100px;
            border-radius: 50px;
            margin: 8px 32px;
        }
        .mdl-demo .is-small-screen section.section--footer .section__circle--big {
            width: 50px;
            height: 50px;
            border-radius: 25px;
            margin: 8px 16px;
        }
        .mdl-demo section.section--footer {
            padding: 64px 0;
            margin: 0 -8px -8px -8px;
        }
        .mdl-demo section.section--center .section__text:not(:last-child) {
            border-bottom: 1px solid rgba(0,0,0,.13);
        }
        .mdl-demo .mdl-card .mdl-card__supporting-text > h3:first-child {
            margin-bottom: 24px;
        }
        .mdl-demo .mdl-layout__tab-panel:not(#overview) {
            background-color: white;
        }
        .mdl-demo #features section {
            margin-bottom: 72px;
        }
        .mdl-demo #features h4, #features h5 {
            margin-bottom: 16px;
        }
        .mdl-demo .toc {
            border-left: 4px solid #C1EEF4;
            margin: 24px;
            padding: 0;
            padding-left: 8px;
            display: -webkit-flex;
            display: -ms-flexbox;
            display: flex;
            -webkit-flex-direction: column;
            -ms-flex-direction: column;
            flex-direction: column;
        }
        .mdl-demo .toc h4 {
            font-size: 0.9rem;
            margin-top: 0;
        }
        .mdl-demo .toc a {
            color: #4DD0E1;
            text-decoration: none;
            font-size: 16px;
            line-height: 28px;
            display: block;
        }
        .mdl-demo .mdl-menu__container {
            z-index: 99;
        }
    </style>
</head>
<body class="mdl-demo mdl-color--grey-100 mdl-color-text--grey-700 mdl-base">
<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
    <header class="mdl-layout__header mdl-layout__header--scroll mdl-color--primary">
        <div class="mdl-layout--large-screen-only mdl-layout__header-row">
        </div>
        <div class="mdl-layout--large-screen-only mdl-layout__header-row">
            <h3>Dirt Diggler's Shitty Sports Show</h3>
        </div>
        <div class="mdl-layout--large-screen-only mdl-layout__header-row">
        </div>
        <div class="mdl-layout--large-screen-only mdl-layout__header-row mdl-color--primary-dark">
        </div>
    </header>
    <main class="mdl-layout__content">
        <div class="mdl-layout__tab-panel is-active" id="overview">
            <section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
                <div class="mdl-card mdl-cell mdl-cell--12-col">
                    <div class="mdl-card__supporting-text">
                        <h4>About the show</h4>
                        I'm a fan of Philly sports, but I have no problems talking about the sports of other cities. I'm sure some of my opinions and the language I use to express them will bother some of you, and I'm OK with that. Send your suggestions/hate-mail regarding to <a htef="mailto:dirtdiggler2823@gmail.com">dirtdiggler2823@gmail.com</a>.
                    </div>
                </div>
            </section>
            <section class="section--center mdl-grid mdl-grid--no-spacing mdl-shadow--2dp">
                <div class="mdl-card mdl-cell mdl-cell--12-col">
                    <div class="mdl-card__supporting-text mdl-grid mdl-grid--no-spacing">
                        <h4 class="mdl-cell mdl-cell--12-col">Recent posts</h4>
                        <div class="mdl-grid">
                            <c:forEach items="${postContainer.posts}" var="post" varStatus="i" begin="0">
                                ${post.html}
                            </c:forEach>
                            <div class="mdl-cell mdl-cell--6-col">
                                <blockquote class="instagram-media" data-instgrm-captioned data-instgrm-version="7" style=" background:#FFF; border:0; border-radius:3px; box-shadow:0 0 1px 0 rgba(0,0,0,0.5),0 1px 10px 0 rgba(0,0,0,0.15); margin: 1px; max-width:658px; padding:0; width:99.375%; width:-webkit-calc(100% - 2px); width:calc(100% - 2px);">
                                    <div style="padding:8px;">
                                        <div style=" background:#F8F8F8; line-height:0; margin-top:40px; padding:50.0% 0; text-align:center; width:100%;">
                                            <div style=" background:url(data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACwAAAAsCAMAAAApWqozAAAABGdBTUEAALGPC/xhBQAAAAFzUkdCAK7OHOkAAAAMUExURczMzPf399fX1+bm5mzY9AMAAADiSURBVDjLvZXbEsMgCES5/P8/t9FuRVCRmU73JWlzosgSIIZURCjo/ad+EQJJB4Hv8BFt+IDpQoCx1wjOSBFhh2XssxEIYn3ulI/6MNReE07UIWJEv8UEOWDS88LY97kqyTliJKKtuYBbruAyVh5wOHiXmpi5we58Ek028czwyuQdLKPG1Bkb4NnM+VeAnfHqn1k4+GPT6uGQcvu2h2OVuIf/gWUFyy8OWEpdyZSa3aVCqpVoVvzZZ2VTnn2wU8qzVjDDetO90GSy9mVLqtgYSy231MxrY6I2gGqjrTY0L8fxCxfCBbhWrsYYAAAAAElFTkSuQmCC); display:block; height:44px; margin:0 auto -44px; position:relative; top:-22px; width:44px;"></div>
                                        </div>
                                        <p style=" margin:8px 0 0 0; padding:0 4px;"> <a href="https://www.instagram.com/p/BT4xeedFJEr/" style=" color:#000; font-family:Arial,sans-serif; font-size:14px; font-style:normal; font-weight:normal; line-height:17px; text-decoration:none; word-wrap:break-word;" target="_blank">Another travel adventure. Missed my stop, ended up all the way in Baltimore.</a></p>
                                        <p style=" color:#c9c8cd; font-family:Arial,sans-serif; font-size:14px; line-height:17px; margin-bottom:0; margin-top:8px; overflow:hidden; padding:8px 0 7px; text-align:center; text-overflow:ellipsis; white-space:nowrap;">A post shared by Dirt Diggler (@dirt.diggler2823) on <time style=" font-family:Arial,sans-serif; font-size:14px; line-height:17px;" datetime="2017-05-09T21:42:32+00:00">May 9, 2017 at 2:42pm PDT</time></p>
                                    </div>
                                </blockquote>
                            </div>
                            <div class="mdl-cell mdl-cell--6-col">
                                <iframe width="100%" height="300" src="https://www.mixcloud.com/widget/iframe/?feed=https%3A%2F%2Fwww.mixcloud.com%2FDirtDiggler2823%2Fdirt-digglers-shitty-sports-show-season-2-why-your-division-sucks-afc-west-e08%2F&hide_cover=1&light=1" frameborder="0"></iframe>
                            </div>
                            <div class="mdl-cell mdl-cell--6-col">
                                <iframe width="100%" height="300" scrolling="no" frameborder="no" src="https://w.soundcloud.com/player/?url=https%3A//api.soundcloud.com/tracks/337640834&amp;auto_play=false&amp;hide_related=false&amp;show_comments=true&amp;show_user=true&amp;show_reposts=false&amp;visual=true"></iframe>
                            </div>
                        </div>
                    </div>
                </div>
            </section>
        </div>
        <div class="mdl-layout--large-screen-only mdl-layout__header-row">
        </div>
        <footer class="mdl-mega-footer">
            <div class="mdl-mega-footer--middle-section">
                <div class="mdl-mega-footer--drop-down-section">
                    <input class="mdl-mega-footer--heading-checkbox" type="checkbox" checked>
                    <h1 class="mdl-mega-footer--heading">Links</h1>
                    <ul class="mdl-mega-footer--link-list">
                        <li><a href="https://www.facebook.com/DirtDigglersSh1ttySportsShow/">Facebook</a></li>
                        <li><a href="https://twitter.com/DirtsDiggler">Twitter</a></li>
                        <li><a href="https://www.instagram.com/dirt.diggler2823/">Instagram</a></li>
                        <li><a href="https://www.mixcloud.com/DirtDiggler2823/">Mixcloud</a></li>
                        <li><a href="https://www.youtube.com/channel/UChmOdEwe2I-zj1Es8utd8qg">YouTube</a></li>
                        <li><a href="https://www.patreon.com/Dirtdiggler2823">Patreon</a></li>
                        <li><a href="https://soundcloud.com/dirt-diggler2823">Sound Cloud</a></li>
                    </ul>
                </div>
            </div>
            <div class="mdl-mega-footer--bottom-section">
                <div class="mdl-logo">
                    Made by <a href="www.kirinpatel.com" target="_blank">Kirin Patel</a> using <a href="https://getmdl.io/index.html">Material Design Lite</a>
                </div>
            </div>
        </footer>
    </main>
</div>
<script src="https://code.getmdl.io/1.3.0/material.min.js"></script>
<script async src="//platform.twitter.com/widgets.js" charset="utf-8"></script>
<script async defer src="//platform.instagram.com/en_US/embeds.js"></script>
</body>
</html>
