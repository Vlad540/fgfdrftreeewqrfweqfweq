package defpackage;

import ru.ok.messages.settings.caching.FrgCachingSettings;

/* renamed from: w06  reason: default package */
public final /* synthetic */ class w06 implements of3, ifd {
    public final /* synthetic */ FrgCachingSettings a;

    public /* synthetic */ w06(FrgCachingSettings frgCachingSettings) {
        this.a = frgCachingSettings;
    }

    public String a(float f) {
        return this.a.K1[(int) f];
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [n83, java.lang.Object] */
    public void accept(Object obj) {
        xi4 xi4 = (xi4) obj;
        FrgCachingSettings frgCachingSettings = this.a;
        if (frgCachingSettings.C1 == null) {
            frgCachingSettings.C1 = new Object();
        }
        frgCachingSettings.C1.a(xi4);
    }
}
