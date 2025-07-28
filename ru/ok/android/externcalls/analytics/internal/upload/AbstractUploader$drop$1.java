package ru.ok.android.externcalls.analytics.internal.upload;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.utils.Files;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljue;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class AbstractUploader$drop$1 extends b97 implements s16 {
    final /* synthetic */ AbstractUploader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractUploader$drop$1(AbstractUploader abstractUploader) {
        super(0);
        this.this$0 = abstractUploader;
    }

    public final void invoke() {
        File file = (File) this.this$0.getStorage().get();
        try {
            if (!file.exists()) {
                CallAnalyticsLogger logger = this.this$0.getLogger();
                String access$getLogTag$p = this.this$0.logTag;
                logger.d(access$getLogTag$p, "don't drop storage " + file + ", file doesn't exist");
                return;
            }
            Files.delete(file);
            CallAnalyticsLogger logger2 = this.this$0.getLogger();
            String access$getLogTag$p2 = this.this$0.logTag;
            logger2.d(access$getLogTag$p2, "storage dropped:  " + file);
        } catch (IOException e) {
            CallAnalyticsLogger logger3 = this.this$0.getLogger();
            String access$getLogTag$p3 = this.this$0.logTag;
            logger3.e(access$getLogTag$p3, "storage drop failed " + file, e);
        }
    }
}
