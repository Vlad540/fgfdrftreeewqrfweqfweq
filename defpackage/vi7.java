package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;

/* renamed from: vi7  reason: default package */
public final class vi7 extends er3 {
    public uu4 X;
    public tae Y;
    public LoadEmojiFontWorker Z;
    public LoadEmojiFontWorker o;
    public /* synthetic */ Object w0;
    public final /* synthetic */ LoadEmojiFontWorker x0;
    public int y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vi7(LoadEmojiFontWorker loadEmojiFontWorker, Continuation continuation) {
        super(continuation);
        this.x0 = loadEmojiFontWorker;
    }

    public final Object o(Object obj) {
        this.w0 = obj;
        this.y0 |= Integer.MIN_VALUE;
        return this.x0.doForegroundWork(this);
    }
}
