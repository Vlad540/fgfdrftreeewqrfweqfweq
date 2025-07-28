package defpackage;

import android.os.Bundle;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;

/* renamed from: k87  reason: default package */
public final class k87 {
    public final /* synthetic */ KeyboardStickersWidget a;
    public final /* synthetic */ Bundle b;

    public k87(KeyboardStickersWidget keyboardStickersWidget, Bundle bundle) {
        this.a = keyboardStickersWidget;
        this.b = bundle;
    }

    public final void a(ktd ktd) {
        taf.o(((u68) this.a.b.getValue()).X, q68.a);
        b87 b87 = b87.c;
        long j = this.b.getLong("arg_key_chat_id");
        d34 P1 = b87.P1();
        P1.b(":stickers/preview?sticker_id=" + ktd.a + "&chat_id=" + j, (Bundle) null);
    }
}
