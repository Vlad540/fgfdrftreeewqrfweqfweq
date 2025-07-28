package one.me.rlottie;

import android.content.Context;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\u0003R(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X.¢\u0006\u0018\n\u0004\b\u0005\u0010\u000b\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\bR\u001a\u0010\u0014\u001a\u00020\u00108FX\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lone/me/rlottie/RLottie;", "", "<init>", "()V", "Lone/me/rlottie/RLottie$Config;", "config", "Ljue;", "init", "(Lone/me/rlottie/RLottie$Config;)V", "checkNativeLibraryLoad$rlottie_release", "checkNativeLibraryLoad", "Lone/me/rlottie/RLottie$Config;", "getConfig", "()Lone/me/rlottie/RLottie$Config;", "setConfig", "getConfig$annotations", "Lgg9;", "getLogger", "()Lgg9;", "getLogger$annotations", "logger", "WorkQueue", "Config", "rlottie_release"}, k = 1, mv = {2, 0, 0})
public final class RLottie {
    public static final RLottie INSTANCE = new RLottie();
    public static Config config;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lone/me/rlottie/RLottie$Config;", "", "Landroid/content/Context;", "context", "", "isEnabled", "Lone/me/rlottie/NativeLibraryLoader;", "nativeLibraryLoader", "", "screenRefreshRate", "Lgg9;", "logger", "<init>", "(Landroid/content/Context;ZLone/me/rlottie/NativeLibraryLoader;FLgg9;)V", "Z", "Lone/me/rlottie/NativeLibraryLoader;", "getNativeLibraryLoader", "()Lone/me/rlottie/NativeLibraryLoader;", "F", "Lgg9;", "getLogger", "()Lgg9;", "rlottie_release"}, k = 1, mv = {2, 0, 0})
    public static final class Config {
        public final boolean isEnabled;
        private final gg9 logger;
        private final NativeLibraryLoader nativeLibraryLoader;
        public final float screenRefreshRate;

        public Config(Context context, boolean z) {
            this(context, z, (NativeLibraryLoader) null, 0.0f, (gg9) null, 28, (x54) null);
        }

        public final gg9 getLogger() {
            return this.logger;
        }

        public final NativeLibraryLoader getNativeLibraryLoader() {
            return this.nativeLibraryLoader;
        }

        public Config(Context context, boolean z, NativeLibraryLoader nativeLibraryLoader2) {
            this(context, z, nativeLibraryLoader2, 0.0f, (gg9) null, 24, (x54) null);
        }

        public Config(Context context, boolean z, NativeLibraryLoader nativeLibraryLoader2, float f) {
            this(context, z, nativeLibraryLoader2, f, (gg9) null, 16, (x54) null);
        }

        public Config(Context context, boolean z, NativeLibraryLoader nativeLibraryLoader2, float f, gg9 gg9) {
            this.isEnabled = z;
            this.nativeLibraryLoader = nativeLibraryLoader2;
            this.screenRefreshRate = f;
            this.logger = gg9;
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public Config(android.content.Context r7, boolean r8, one.me.rlottie.NativeLibraryLoader r9, float r10, j06 r11, int r12, x54 r13) {
            /*
                r6 = this;
                r13 = r12 & 4
                if (r13 == 0) goto L_0x000a
                one.me.rlottie.NativeLibraryLoader$Companion r9 = one.me.rlottie.NativeLibraryLoader.Companion
                one.me.rlottie.NativeLibraryLoader r9 = r9.getDefault()
            L_0x000a:
                r3 = r9
                r9 = r12 & 8
                if (r9 == 0) goto L_0x0035
                java.lang.String r9 = "display"
                java.lang.Object r9 = r7.getSystemService(r9)
                if (r9 == 0) goto L_0x0032
                android.hardware.display.DisplayManager r9 = (android.hardware.display.DisplayManager) r9
                android.view.Display[] r9 = r9.getDisplays()
                int r10 = r9.length
                r13 = 0
                r0 = 1
                if (r10 != 0) goto L_0x0024
                r10 = r0
                goto L_0x0025
            L_0x0024:
                r10 = r13
            L_0x0025:
                r10 = r10 ^ r0
                if (r10 == 0) goto L_0x0030
                r9 = r9[r13]
                float r9 = r9.getRefreshRate()
            L_0x002e:
                r10 = r9
                goto L_0x0035
            L_0x0030:
                r9 = 0
                goto L_0x002e
            L_0x0032:
                r9 = 1114636288(0x42700000, float:60.0)
                goto L_0x002e
            L_0x0035:
                r4 = r10
                r9 = r12 & 16
                if (r9 == 0) goto L_0x003c
                j06 r11 = defpackage.fg9.a
            L_0x003c:
                r5 = r11
                r0 = r6
                r1 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottie.Config.<init>(android.content.Context, boolean, one.me.rlottie.NativeLibraryLoader, float, gg9, int, x54):void");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\tø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lone/me/rlottie/RLottie$WorkQueue;", "", "Ljava/lang/Runnable;", "action", "Ljue;", "post", "(Ljava/lang/Runnable;)V", "", "delay", "(Ljava/lang/Runnable;J)V", "rlottie_release"}, k = 1, mv = {2, 0, 0})
    public interface WorkQueue {
        void post(Runnable runnable) {
        }

        void post(Runnable runnable, long j) {
        }
    }

    private RLottie() {
    }

    public static final Config getConfig() {
        Config config2 = config;
        if (config2 != null) {
            return config2;
        }
        return null;
    }

    public static /* synthetic */ void getConfig$annotations() {
    }

    public static final gg9 getLogger() {
        return getConfig().getLogger();
    }

    public static /* synthetic */ void getLogger$annotations() {
    }

    public static final void init(Config config2) {
        setConfig(config2);
        config2.getNativeLibraryLoader().load();
    }

    public static final void setConfig(Config config2) {
        config = config2;
    }

    public final void checkNativeLibraryLoad$rlottie_release() {
        try {
            RLottieDrawable.foo();
        } catch (UnsatisfiedLinkError unused) {
            NativeLibraryLoader.Companion.getDefault().load();
        }
    }
}
