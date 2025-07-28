package ru.ok.android.externcalls.sdk.audio.internal.tracer;

import android.content.Context;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.BuildConfig;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzne;", "invoke", "()Lzne;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
public final class TracerLiteFacade$tracerLite$2 extends b97 implements s16 {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TracerLiteFacade$tracerLite$2(Context context) {
        super(0);
        this.$context = context;
    }

    public final zne invoke() {
        Context applicationContext = this.$context.getApplicationContext();
        AnonymousClass1 r1 = AnonymousClass1.INSTANCE;
        xne xne = new xne();
        r1.invoke(xne);
        zne zne = new zne(applicationContext, BuildConfig.LIBRARY_PACKAGE_NAME, new f2b(xne));
        zne.b(TracerLiteFacade.KEY_AUDIOMANAGER_VERSION, BuildConfig.SDK_VERSION);
        return zne;
    }
}
