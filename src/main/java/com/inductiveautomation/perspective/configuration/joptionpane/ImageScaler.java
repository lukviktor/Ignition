package com.inductiveautomation.perspective.configuration.joptionpane;

import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageScaler {

    public static Image scaleImage(Image image, int width, int height) {
        int imageWidth = image.getWidth(null);
        int imageHeight = image.getHeight(null);

        double scaleX = (double) width / imageWidth;
        double scaleY = (double) height / imageHeight;
        double scale = Math.min(scaleX, scaleY);

        int scaledWidth = (int) (imageWidth * scale);
        int scaledHeight = (int) (imageHeight * scale);

        BufferedImage scaledImage = new BufferedImage(scaledWidth, scaledHeight, BufferedImage.TYPE_INT_ARGB);

        Graphics2D graphics2D = scaledImage.createGraphics();
        graphics2D.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        graphics2D.drawImage(image, 0, 0, scaledWidth, scaledHeight, null);
        graphics2D.dispose();

        return scaledImage;
    }
}