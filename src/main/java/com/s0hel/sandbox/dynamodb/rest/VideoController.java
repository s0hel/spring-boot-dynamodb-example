package com.s0hel.sandbox.dynamodb.rest;

import com.s0hel.sandbox.dynamodb.entity.Video;
import com.s0hel.sandbox.dynamodb.service.VideoService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.StreamSupport;

@RestController
public class VideoController {

    private final VideoService videoService;

    public VideoController(VideoService videoService) {
        this.videoService = videoService;
    }

    @GetMapping("/videos")
    public Collection<Video> getVideos() {
        return StreamSupport.stream(videoService.getAllVideos().spliterator(), false)
                .collect(java.util.stream.Collectors.toList());
    }

    @PutMapping("/videos")
    public Video putVideo(@RequestBody Video video) {
       return videoService.updateVideo(video);
    }

    @PostMapping("/videos")
    public Video postVideo(@RequestBody Video video) {
        return videoService.saveVideo(video);
    }

    @GetMapping("/videos/{videoId}")
    public Video getVideo(@PathVariable("videoId") String videoId) {
        return videoService.getVideoById(videoId);
    }

    @DeleteMapping("/videos/{videoId}")
    public void deleteVideo(@PathVariable("videoId") String videoId) {
        videoService.deleteVideo(videoId);
    }

}
