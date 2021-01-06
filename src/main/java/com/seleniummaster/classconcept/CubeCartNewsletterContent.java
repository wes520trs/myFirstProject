package com.seleniummaster.classconcept;

public class CubeCartNewsletterContent {
    private String subject;
    private String senderName;
    private String senderEmail;
    private String newsletterContent;

    public CubeCartNewsletterContent() {
    }

    public CubeCartNewsletterContent(String subject, String senderName, String senderEmail) {
        this.subject = subject;
        this.senderName = senderName;
        this.senderEmail = senderEmail;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderEmail() {
        return senderEmail;
    }

    public void setSenderEmail(String senderEmail) {
        this.senderEmail = senderEmail;
    }

    public String getNewsletterContent() {
        return newsletterContent;
    }

    public void setNewsletterContent(String newsletterContent) {
        this.newsletterContent = newsletterContent;
    }
}
