package com.osdatahub.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DownloadsApi {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("links")
    @Expose
    private List<Link> links;

    /**
     * No args constructor for use in serialization
     *
     */
    public DownloadsApi() {
    }

    /**
     *
     * @param description
     * @param links
     * @param title
     */
    public DownloadsApi(String title, String description, List<Link> links) {
        super();
        this.title = title;
        this.description = description;
        this.links = links;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

}