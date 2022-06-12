package com.example.proyecto_spring_html_th;

public class Calendario {
    private String actionText;
    private String actionTime;
    private String actionDate;

    public Calendario(String actionText) {
        this.actionText = actionText;
    }

    public String getActionText() {
        return actionText;
    }

    public void setActionText(String actionText) {
        this.actionText = actionText;
    }

    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public String getActionDate() {
        return actionDate;
    }

    public void setActionDate(String actionDate) {
        this.actionDate = actionDate;
    }
}


