/**
 * This file is released under the Apache License 2.0. See the LICENSE file for details.
 **/
package com.github.kskelm.baringo.model.gallery;

import com.github.kskelm.baringo.model.Comment;
import com.github.kskelm.baringo.model.Image;
import com.github.kskelm.baringo.model.gallery.GalleryAlbum.Layout;
import com.github.kskelm.baringo.model.gallery.GalleryAlbum.Privacy;
import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * <b>INTERNAL ONLY - don't use this for anything.</b>
 * <p>
 * Sometimes you do something that makes you feel dirty
 * inside, like taking dynamically typed objects out
 * of an API response, and then having to sort through
 * keys to figure out what kind of strictly typed object
 * it ought to be.  This class is just a temporary landing
 * zone for data coming in on methods that return lists of
 * GalleryItems so it can be determined if it's an album or
 * an image, then creating the real objects.
 * <p>
 * Retrofit probably supports a better way to do this in
 * the future that doesn't require a bunch of proxy objects
 * to be created before making the real ones.
 *
 * @author Alan Smithee
 *
 */
@SuppressWarnings("unused")
public class GalleryItemProxy {

    public String id;
    public String title;
    public String description;
    @SerializedName("datetime")
    public Date uploadDate;
    public int views;
    public String link;
    public String vote;
    public int ups;
    public int downs;
    public int points;
    public int score;
    public boolean favorite;
    public boolean nsfw;
    @SerializedName("comment_count")
    public int commentCount;
    @SerializedName("comment_preview")
    public List<Comment> commentPreview;
    public String topic;
    @SerializedName("topic_id")
    public int topicId;
    @SerializedName("account_url")
    public String userName;
    @SerializedName("account_id")
    public int userId;
    @SerializedName("type")
    public String mimeType;
    public boolean animated;
    public int width;
    public int height;
    public int size;
    public long bandwidth;
    @SerializedName("deletehash")
    public String deleteHash;
    public String gifvLink;
    public String mp4Link;
    public String webmLink;
    public boolean looping;
    public GalleryItem.Section section;
    public String coverId;
    public int coverWidth;
    public int coverHeight;
    public Privacy privacy;
    public Layout layout;
    @SerializedName("images_count")
    public int imageCount;
    public List<Image> images;
    @SerializedName("is_album")
    public boolean album;

    // TODO: SWITCH THIS OVER TO THE JSONDESERIALIZER APPROACH USED IN COMMENTSERVICE
    public boolean isAlbum() {
        return album;
    }
    // only for meme subclasses
// UPDATE: apparently Imgur doesn't really support this anymore at least
// as of 6/24/15.  https://groups.google.com/forum/#!msg/imgur/BEyZryAhGi0/yfOFyixuPy4J
//	@SerializedName("is_album")
//	protected MemeMetaData memeMetaData;

    // only for subreddit classes
// UPDATE: apparently Imgur doesn't really support this anymore
//	@SerializedName("reddit_comments")
//	protected String redditCommentsUrl;

}
