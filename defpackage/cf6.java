package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;

/* renamed from: cf6  reason: default package */
public final class cf6 extends l5e implements i26 {
    public final /* synthetic */ ef6 X;
    public final /* synthetic */ File Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cf6(ef6 ef6, File file, Continuation continuation) {
        super(2, continuation);
        this.X = ef6;
        this.Y = file;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((cf6) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cf6(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = (hba) this.X.d.getValue();
        hba.i("Дамп памяти закончился");
        String absolutePath = this.Y.getAbsolutePath();
        hba.b("Если что файл можно будет найти по этому пути: " + absolutePath);
        return hba.j();
    }
}
