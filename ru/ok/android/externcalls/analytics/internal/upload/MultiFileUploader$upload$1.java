package ru.ok.android.externcalls.analytics.internal.upload;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class MultiFileUploader$upload$1 extends b97 implements s16 {
    final /* synthetic */ MultiFileUploader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiFileUploader$upload$1(MultiFileUploader multiFileUploader) {
        super(0);
        this.this$0 = multiFileUploader;
    }

    public final void invoke() {
        try {
            boolean unused = this.this$0.uploadImpl();
        } catch (Throwable th) {
            this.this$0.getLogger().report(MultiFileUploader.LOG_TAG, "Upload failed", new UploadException(this.this$0.getCollector(), th));
        }
        this.this$0.scheduleNextUpload();
    }
}
