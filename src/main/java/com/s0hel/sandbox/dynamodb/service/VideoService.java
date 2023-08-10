package com.s0hel.sandbox.dynamodb.service;

import com.s0hel.sandbox.dynamodb.entity.Video;
import com.s0hel.sandbox.dynamodb.repository.VideoRepository;
import org.springframework.stereotype.Service;

@Service
public class VideoService {

    private VideoRepository videoRepository;

    public VideoService(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video createVideo(Video video) {
        return videoRepository.save(video);
    }

    public Video getVideoById(String videoId) {
        return videoRepository.findById(videoId).orElse(null);
    }

    public Iterable<Video> getAllVideos() {
        return videoRepository.findAll();
    }

    public Video updateVideo(Video video) {
        return videoRepository.save(video);
    }

    public void deleteVideo(String videoId) {
        videoRepository.deleteById(videoId);
    }

}
