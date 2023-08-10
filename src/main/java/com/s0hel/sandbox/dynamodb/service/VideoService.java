package com.s0hel.sandbox.dynamodb.service;

import com.s0hel.sandbox.dynamodb.entity.Video;
import com.s0hel.sandbox.dynamodb.repository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    private final VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video saveVideo(Video video) {
        return videoRepository.save(video);
    }

    public Video updateVideo(Video video) {
        Video videoToUpdate = getVideoById(video.getVideoId());
        videoToUpdate.setVideoName(video.getVideoName());
        videoToUpdate.setVideoUrl(video.getVideoUrl());
        return videoRepository.save(video);
    }

    public Video getVideoById(String videoId) {
        return videoRepository.findById(videoId).orElse(null);
    }

    public Iterable<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public void deleteVideo(String videoId) {
        videoRepository.deleteById(videoId);
    }

}
