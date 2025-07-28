package defpackage;

import org.webrtc.AudioSource;
import org.webrtc.AudioTrack;
import org.webrtc.MediaConstraints;
import org.webrtc.MediaSource;
import org.webrtc.MediaStream;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnectionFactory;

/* renamed from: l50  reason: default package */
public final class l50 extends cf3 {
    public final PeerConnectionFactory Y;

    public l50(PeerConnectionFactory peerConnectionFactory, String str, MediaStream mediaStream, xwb xwb) {
        super(str, mediaStream, xwb);
        this.Y = peerConnectionFactory;
    }

    public final void b(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.addTrack(audioTrack);
        }
    }

    public final void c(MediaStream mediaStream, MediaStreamTrack mediaStreamTrack) {
        AudioTrack audioTrack = (AudioTrack) mediaStreamTrack;
        if (mediaStream != null) {
            mediaStream.removeTrack(audioTrack);
        }
    }

    public final MediaSource g() {
        return this.Y.createAudioSource(new MediaConstraints());
    }

    public final MediaStreamTrack h(String str, MediaSource mediaSource) {
        return this.Y.createAudioTrack(str, (AudioSource) mediaSource);
    }

    public final String toString() {
        return "OkSdkAudioRecord";
    }
}
