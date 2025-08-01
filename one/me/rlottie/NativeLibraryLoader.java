package one.me.rlottie;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bæ\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0003\u0010\u0007ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lone/me/rlottie/NativeLibraryLoader;", "", "Ljue;", "load", "()V", "", "libName", "(Ljava/lang/String;)V", "Companion", "rlottie_release"}, k = 1, mv = {2, 0, 0})
public interface NativeLibraryLoader {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String LIB_NAME = "jlottie";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005XT¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lone/me/rlottie/NativeLibraryLoader$Companion;", "", "<init>", "()V", "LIB_NAME", "", "Default", "Lone/me/rlottie/NativeLibraryLoader;", "getDefault", "()Lone/me/rlottie/NativeLibraryLoader;", "rlottie_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final NativeLibraryLoader Default = new Object();
        public static final String LIB_NAME = "jlottie";

        private Companion() {
        }

        /* access modifiers changed from: private */
        public static final void Default$lambda$0(String str) {
            try {
                System.loadLibrary("jlottie");
            } catch (Throwable th) {
                RLottie.getLogger().o(th);
            }
        }

        public final NativeLibraryLoader getDefault() {
            return Default;
        }
    }

    void load() {
        try {
            load("jlottie");
        } catch (Throwable th) {
            RLottie.getLogger().o(th);
        }
    }

    void load(String str);
}
