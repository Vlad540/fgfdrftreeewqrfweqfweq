package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.utils.Files;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 92\u00020\u0001:\u00039:;BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u00101\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u001b\u00108\u001a\u0002038BX\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "looperProvider", "Ljava/io/File;", "dir", "Ljava/util/concurrent/locks/Lock;", "lock", "", "collector", "", "isContentCompressed", "", "fileCountLimit", "", "timeBeforeNextUploadMs", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Ljava/lang/String;ZILjava/lang/Long;)V", "Ljue;", "scheduleNextUpload", "()V", "triggerUpload", "uploadImpl", "()Z", "file", "uploadFileWithResultCheck", "(Ljava/io/File;)Z", "createNewFile", "()Ljava/io/File;", "", "getAllFiles", "()Ljava/util/List;", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "getStorageInfo", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "dropOldestFile", "(Ljava/io/File;)V", "files", "calcBestNameForNewFile", "(Ljava/util/List;)Ljava/lang/String;", "index", "getFileNameForIndex", "(I)Ljava/lang/String;", "getSink", "upload", "Ljavax/inject/Provider;", "I", "Ljava/lang/Long;", "fileIndexStringLength", "scaleUpNextUploadTimeout", "Landroid/os/Handler;", "handler$delegate", "Lt97;", "getHandler", "()Landroid/os/Handler;", "handler", "Companion", "LooperCallback", "StorageInfo", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
public final class MultiFileUploader extends AbstractUploader {
    @Deprecated
    public static final String CHUNK_FILE_NAME_PREFIX = "chunk";
    private static final Companion Companion = new Companion((x54) null);
    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsUploaderV2";
    @Deprecated
    public static final int MSG_TRY_UPLOAD_NEXT = 1001;
    @Deprecated
    public static final long UPLOAD_NEXT_INTERVAL = 5000;
    /* access modifiers changed from: private */
    public final int fileCountLimit;
    private final int fileIndexStringLength;
    private final t97 handler$delegate;
    /* access modifiers changed from: private */
    public final Provider<Looper> looperProvider;
    private volatile int scaleUpNextUploadTimeout;
    private final Long timeBeforeNextUploadMs;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXT¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$Companion;", "", "()V", "CHUNK_FILE_NAME_PREFIX", "", "LOG_TAG", "MSG_TRY_UPLOAD_NEXT", "", "UPLOAD_NEXT_INTERVAL", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(x54 x54) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$LooperCallback;", "Landroid/os/Handler$Callback;", "uploader", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "(Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;)V", "getUploader", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "handleMessage", "", "msg", "Landroid/os/Message;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LooperCallback implements Handler.Callback {
        private final MultiFileUploader uploader;

        public LooperCallback(MultiFileUploader multiFileUploader) {
            this.uploader = multiFileUploader;
        }

        public final MultiFileUploader getUploader() {
            return this.uploader;
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1001) {
                return false;
            }
            this.uploader.triggerUpload();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "", "oldestFile", "Ljava/io/File;", "allFiles", "", "(Ljava/io/File;Ljava/util/List;)V", "getAllFiles", "()Ljava/util/List;", "getOldestFile", "()Ljava/io/File;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StorageInfo {
        private final List<File> allFiles;
        private final File oldestFile;

        public StorageInfo(File file, List<? extends File> list) {
            this.oldestFile = file;
            this.allFiles = list;
        }

        public final List<File> getAllFiles() {
            return this.allFiles;
        }

        public final File getOldestFile() {
            return this.oldestFile;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult[] r0 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.RECOVERABLE_ERROR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.SKIP     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.BAD_CONTENT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$UploadResult r1 = ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader.UploadResult.ERROR     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.WhenMappings.<clinit>():void");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MultiFileUploader(Provider provider, Provider provider2, Lock lock, String str, boolean z, int i, Long l, int i2, x54 x54) {
        this(provider, provider2, lock, str, z, (i2 & 32) != 0 ? 10 : i, l);
    }

    /* access modifiers changed from: private */
    public final String calcBestNameForNewFile(List<? extends File> list) {
        T t;
        int i = this.fileCountLimit;
        for (int i2 = 0; i2 < i; i2++) {
            String fileNameForIndex = getFileNameForIndex(i2);
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (hhd.f(fileNameForIndex, ((File) t).getName())) {
                    break;
                }
            }
            if (t == null) {
                if (!new File((File) getStorage().get(), fileNameForIndex).exists()) {
                    getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not found, provide it");
                    return fileNameForIndex;
                }
                getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not listed but file exists");
            }
        }
        String fileNameForIndex2 = getFileNameForIndex(0);
        getLogger().d(LOG_TAG, "Nothing found, default to " + fileNameForIndex2);
        return fileNameForIndex2;
    }

    /* access modifiers changed from: private */
    public final File createNewFile() {
        return (File) withLock(new MultiFileUploader$createNewFile$1(this));
    }

    /* access modifiers changed from: private */
    public final void dropOldestFile(File file) {
        try {
            Files.delete(file);
            CallAnalyticsLogger logger = getLogger();
            String path = file.getPath();
            logger.d(LOG_TAG, "Oldest file " + path + " dropped");
        } catch (IOException e) {
            getLogger().e(LOG_TAG, wn6.i("Oldest file ", file.getPath(), " drop request failed"), e);
        }
    }

    /* access modifiers changed from: private */
    public final List<File> getAllFiles() {
        File[] listFiles = ((File) getStorage().get()).listFiles();
        return listFiles != null ? cs.X(listFiles) : hw4.a;
    }

    private final String getFileNameForIndex(int i) {
        return this.fileIndexStringLength > 1 ? rf0.h("chunk_", h0e.h0(String.valueOf(i), this.fileIndexStringLength, '_')) : wn6.h(i, "chunk_");
    }

    private final Handler getHandler() {
        return (Handler) this.handler$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final StorageInfo getStorageInfo() {
        List<File> allFiles = getAllFiles();
        File file = null;
        long j = 0;
        for (File file2 : allFiles) {
            if (file2.exists() && (file == null || file2.lastModified() < j)) {
                j = file2.lastModified();
                file = file2;
            }
        }
        return new StorageInfo(file, allFiles);
    }

    /* access modifiers changed from: private */
    public final void scheduleNextUpload() {
        if (!getStorageInfo().getAllFiles().isEmpty()) {
            Handler handler = getHandler();
            Long l = this.timeBeforeNextUploadMs;
            long longValue = (l != null ? l.longValue() : UPLOAD_NEXT_INTERVAL) * ((long) this.scaleUpNextUploadTimeout);
            getLogger().d(LOG_TAG, us8.j(longValue, "schedule next upload pass in ", " ms"));
            handler.removeMessages(MSG_TRY_UPLOAD_NEXT);
            handler.sendMessageDelayed(handler.obtainMessage(MSG_TRY_UPLOAD_NEXT), longValue);
            return;
        }
        getLogger().d(LOG_TAG, "empty storage, won't schedule new upload");
    }

    /* access modifiers changed from: private */
    public final void triggerUpload() {
        UploadStarter.INSTANCE.startUpload(getCollector());
    }

    private final boolean uploadFileWithResultCheck(File file) {
        int i = WhenMappings.$EnumSwitchMapping$0[uploadFile(file).ordinal()];
        if (i == 1 || i == 2) {
            this.scaleUpNextUploadTimeout = 1;
            return true;
        }
        if (!(i == 3 || i == 4)) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            } else if (this.scaleUpNextUploadTimeout < 6) {
                this.scaleUpNextUploadTimeout *= 2;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final boolean uploadImpl() {
        StorageInfo storageInfo = getStorageInfo();
        File oldestFile = storageInfo.getOldestFile();
        getLogger().d(LOG_TAG, "Try to upload oldest file first");
        if (oldestFile == null || !uploadFileWithResultCheck(oldestFile)) {
            getLogger().d(LOG_TAG, "Try to upload first from the list");
            for (File next : storageInfo.getAllFiles()) {
                if (uploadFileWithResultCheck(next)) {
                    CallAnalyticsLogger logger = getLogger();
                    String path = next.getPath();
                    logger.d(LOG_TAG, "File upload completed: " + path);
                    return true;
                }
            }
            getLogger().d(LOG_TAG, "No files were uploaded");
            return false;
        }
        CallAnalyticsLogger logger2 = getLogger();
        String path2 = oldestFile.getPath();
        logger2.d(LOG_TAG, "Oldest file upload completed: " + path2);
        return true;
    }

    public File getSink() {
        return (File) withLock(new MultiFileUploader$getSink$1(this));
    }

    public void upload() {
        Uploader.IdleStateProvider idleState = getIdleState();
        if (idleState == null || idleState.isIdle()) {
            withLock(new MultiFileUploader$upload$1(this));
        } else {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
        }
    }

    public MultiFileUploader(Provider<Looper> provider, Provider<File> provider2, Lock lock, String str, boolean z, int i, Long l) {
        super(provider2, lock, str, z, LOG_TAG);
        this.looperProvider = provider;
        this.fileCountLimit = i;
        this.timeBeforeNextUploadMs = l;
        int i2 = 10;
        if (i <= 10) {
            i2 = 1;
        } else if (i <= 100) {
            i2 = 2;
        } else if (i <= 1000) {
            i2 = 3;
        }
        this.fileIndexStringLength = i2;
        this.scaleUpNextUploadTimeout = 1;
        this.handler$delegate = new r7e(new MultiFileUploader$handler$2(this));
    }
}
