package com.s0hel.sandbox.dynamodb.rest;

import com.s0hel.sandbox.dynamodb.entity.Video;
import com.s0hel.sandbox.dynamodb.service.VideoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.StreamSupport;

@RestController
public class VideoController {

    private VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/videos")
    public Collection<Video> getVideos() {
        return StreamSupport.stream(videoService.getAllVideos().spliterator(), false)
                .collect(java.util.stream.Collectors.toList());
    }

}
