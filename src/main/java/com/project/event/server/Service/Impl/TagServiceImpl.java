package com.project.event.server.Service.Impl;

import com.project.event.server.Dao.TagDao;
import com.project.event.server.Domain.Dto.TagDto;
import com.project.event.server.Domain.Report.TagReport;
import com.project.event.server.Service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagDao tagDao;

    @Override
    public List<TagReport> getAllTags() {
        return null;
    }

    @Override
    public int createTag(TagDto tagDto) {
        return 0;
    }

    @Override
    public TagReport getTagById(Long id) {
        return null;
    }

    @Override
    public TagReport updateTag(TagDto tagDto) {
        return null;
    }

    @Override
    public void deleteTag(Long id) {

    }
}
