package softuniBlog.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import softuniBlog.entity.Tag;
import softuniBlog.repository.TagRepository;

/**
 * Created by antfesenko on 03.04.2017.
 */
public class TagController {
    @Autowired
    private TagRepository tagRepository;

    @GetMapping("/tag/{name}")
    public String articlesWithTag(Model model, @PathVariable String name){
        Tag tag = this.tagRepository.findByName(name);
        if(tag==null){return "redirect:/";}
        model.addAttribute("view","tag/articles");
        model.addAttribute("tag",tag);
        return "base-layout";
    }

}
