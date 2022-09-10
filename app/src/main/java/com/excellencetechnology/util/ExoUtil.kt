package com.excellencetechnology.util

import android.media.MediaCodec
import android.net.Uri
import com.google.android.exoplayer2.*
import com.google.android.exoplayer2.audio.AudioAttributes
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector
import com.google.android.exoplayer2.trackselection.TrackSelector
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter
import com.google.android.exoplayer2.util.Util

class ExoUtil {
    fun setupExoplayer(playerView: PlayerView, link: Uri) {
        val context = playerView.context
        if (link.toString().isBlank()) {
            return
        }

        val trackSelector: TrackSelector =
                DefaultTrackSelector(context, AdaptiveTrackSelection.Factory())
        val bandwidthMeter: DefaultBandwidthMeter =
                DefaultBandwidthMeter.Builder(context).setResetOnNetworkTypeChange(true)
                        .setInitialBitrateEstimate(Util.getUserAgent(context, context.packageName))
                        .build()

        val mPlayer = SimpleExoPlayer.Builder(context).setTrackSelector(trackSelector)
                .setBandwidthMeter(bandwidthMeter)
                .setUseLazyPreparation(true)
                .setVideoScalingMode(MediaCodec.VIDEO_SCALING_MODE_SCALE_TO_FIT)
                .build()
        mPlayer?.setMediaItem(MediaItem.fromUri(link))

        mPlayer?.addListener(
                object : Player.EventListener {


                    override fun onPlayerError(error: ExoPlaybackException) {
                        super.onPlayerError(error)
                        error.printStackTrace()
                    }
                })

        val audioAttributes: AudioAttributes = AudioAttributes.Builder()
                .setUsage(C.USAGE_MEDIA)
                .setContentType(C.CONTENT_TYPE_MOVIE)
                .build()
        mPlayer?.setAudioAttributes(audioAttributes, true)
        mPlayer?.playWhenReady = true
        mPlayer?.prepare()

        mPlayer?.seekTo(1000)
        playerView.player = mPlayer
    }
}