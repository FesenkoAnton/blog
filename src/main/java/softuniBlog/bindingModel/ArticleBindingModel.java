package softuniBlog.bindingModel;

import softuniBlog.entity.Article;

import javax.validation.constraints.NotNull;

/**
 * Created by antfesenko on 29.03.2017.
 */
public class ArticleBindingModel {
    @NotNull
    private String title;
    @NotNull
    private String content;
    private String tagString;


    private Integer categoryId;


    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTagString() {
        return tagString;
    }

    public void setTagString(String tagString) {
        this.tagString = tagString;
    }

}
