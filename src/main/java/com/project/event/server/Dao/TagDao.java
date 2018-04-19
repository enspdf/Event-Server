package com.project.event.server.Dao;

import com.project.event.server.Domain.Dto.TagDto;
import com.project.event.server.Domain.Report.TagReport;

import java.util.List;

public interface TagDao {
    List<TagReport> getAllTags ();
    int createTag (TagDto tagDto);
    TagReport getTagById (Long id);
    TagReport updateTag (TagDto tagDto);
    void deleteTag (Long id);
}
