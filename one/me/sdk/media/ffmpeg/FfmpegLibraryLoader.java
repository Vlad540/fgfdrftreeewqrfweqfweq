package one.me.sdk.media.ffmpeg;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bæ\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0003\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lone/me/sdk/media/ffmpeg/FfmpegLibraryLoader;", "", "Ljue;", "load", "()V", "", "libName", "(Ljava/lang/String;)V", "Companion", "bc5", "media-ffmpeg_release"}, k = 1, mv = {2, 0, 0})
public interface FfmpegLibraryLoader {
    public static final bc5 Companion = bc5.a;

    void load() {
        load("ffmpg");
    }

    void load(String str);
}
