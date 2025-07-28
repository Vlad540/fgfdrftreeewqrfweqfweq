package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.messages.views.dialogs.SaveToGalleryDialog;

/* renamed from: ckc  reason: default package */
public final class ckc extends l5e implements i26 {
    public int X;
    public final /* synthetic */ SaveToGalleryDialog Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ckc(SaveToGalleryDialog saveToGalleryDialog, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = saveToGalleryDialog;
        this.Z = str;
        this.w0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ckc(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        SaveToGalleryDialog saveToGalleryDialog = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ikc ikc = new ikc((knc) ((o2a) (saveToGalleryDialog.c0() != null ? vl.b() : vl.b())).getAccessor().c(knc.class), ((pae) ((k93) saveToGalleryDialog.I1.b).getAccessor().c(pae.class)).b(), (cla) ((o2a) (saveToGalleryDialog.c0() != null ? vl.b() : vl.b())).getAccessor().c(cla.class));
            this.X = 1;
            obj = ikc.b(this.Z, this.w0, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        saveToGalleryDialog.p1(((Boolean) obj).booleanValue());
        return jue.a;
    }
}
