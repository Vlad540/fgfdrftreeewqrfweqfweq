package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget2;

/* renamed from: zsa  reason: default package */
public final class zsa extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickerChatsListWidget2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zsa(Continuation continuation, PickerChatsListWidget2 pickerChatsListWidget2) {
        super(2, continuation);
        this.Y = pickerChatsListWidget2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zsa) n((String) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zsa zsa = new zsa(continuation, this.Y);
        zsa.X = obj;
        return zsa;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [f6c, gra, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [f6c, gra, java.lang.Object] */
    public final Object o(Object obj) {
        wx3.H(obj);
        PickerChatsListWidget2 pickerChatsListWidget2 = this.Y;
        f6c f6c = (f6c) pickerChatsListWidget2.A0.D().get(0);
        boolean c0 = h0e.c0((String) this.X);
        ? r1 = pickerChatsListWidget2.C0;
        ? r2 = pickerChatsListWidget2.B0;
        t93 t93 = pickerChatsListWidget2.A0;
        if (c0) {
            if (!hhd.f(f6c, r2)) {
                ibe ibe = pickerChatsListWidget2.w0;
                if (ibe != null) {
                    ibe.B(pickerChatsListWidget2.o0());
                }
                t93.F(r1);
                t93.C(r2);
                pickerChatsListWidget2.o0().setRefreshingNext(PickerChatsListWidget2.m0(pickerChatsListWidget2));
                pickerChatsListWidget2.w0 = gp0.l(pickerChatsListWidget2.o0());
            }
        } else if (!hhd.f(f6c, r1)) {
            ibe ibe2 = pickerChatsListWidget2.w0;
            if (ibe2 != null) {
                ibe2.B(pickerChatsListWidget2.o0());
            }
            t93.F(r2);
            t93.C(r1);
            pickerChatsListWidget2.o0().setRefreshingNext(PickerChatsListWidget2.m0(pickerChatsListWidget2));
            pickerChatsListWidget2.w0 = gp0.l(pickerChatsListWidget2.o0());
        }
        return jue.a;
    }
}
