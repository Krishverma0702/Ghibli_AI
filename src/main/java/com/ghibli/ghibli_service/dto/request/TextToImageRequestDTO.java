package com.ghibli.ghibli_service.dto.request;

import lombok.Data;
import org.w3c.dom.Text;

import java.util.List;

@Data
public class TextToImageRequestDTO {

    private List<TextPrompt> text_prompts;
    private double cfg_scale = 7;
    private int height = 512;
    private int width = 768;
    private int samples = 1;
    private int steps = 30;
    private String style_preset;

    public static class TextPrompt {
        private String text;

        public TextPrompt(String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

    }

    public TextToImageRequestDTO(String text, String style) {
        this.text_prompts = List.of(new TextPrompt(text));
        this.style_preset = style;
    }

    // Getters for JSON Serialization

    public List<TextPrompt> getText_prompts() {
        return text_prompts;
    }

    public double getCfg_scale() {
        return cfg_scale;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getSamples() {
        return samples;
    }

    public String getStyle_preset() {
        return style_preset;
    }

    public int getSteps() {
        return steps;
    }
}
