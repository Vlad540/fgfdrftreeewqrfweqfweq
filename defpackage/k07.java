package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: k07  reason: default package */
public abstract class k07 {
    /* JADX WARNING: type inference failed for: r0v2, types: [tde, java.lang.Object] */
    public static l07 a(byte[] bArr) {
        try {
            Tasks.InvalidateAndDownloadAudio mergeFrom = gr8.mergeFrom(new Tasks.InvalidateAndDownloadAudio(), bArr);
            ? obj = new Object();
            Tasks.FileDownload fileDownload = mergeFrom.fileDownload;
            obj.a = fileDownload.messageId;
            obj.b = fileDownload.attachId;
            obj.c = fileDownload.videoId;
            obj.d = fileDownload.audioId;
            obj.e = fileDownload.mp4GifId;
            obj.f = fileDownload.stickerId;
            obj.j = fileDownload.fileId;
            obj.k = fileDownload.fileName;
            obj.g = fileDownload.url;
            obj.h = fileDownload.notifyProgress;
            obj.i = fileDownload.checkAutoloadConnection;
            obj.l = fileDownload.invalidateCount;
            obj.m = fileDownload.useOriginalExtension;
            obj.n = fileDownload.notCopyVideoToGallery;
            return new l07(mergeFrom.requestId, mergeFrom.outputPath, mergeFrom.chatServerId, mergeFrom.serverMessageId, new ude(obj));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
