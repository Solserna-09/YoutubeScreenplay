package com.youtube.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class YoutubeCatalogoUI {

    public static final Target LBL_CANCION = Target.the("titulos de canciones").locatedBy("//yt-formatted-string[@class='style-scope ytd-video-renderer' and not (@is-empty)]");
}
