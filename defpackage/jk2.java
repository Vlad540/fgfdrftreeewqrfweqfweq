package defpackage;

import android.os.Bundle;
import one.me.chatscreen.ChatScreen;

/* renamed from: jk2  reason: default package */
public final /* synthetic */ class jk2 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ em2 b;

    public /* synthetic */ jk2(em2 em2, int i) {
        this.a = i;
        this.b = em2;
    }

    public final Object invoke() {
        jue jue = jue.a;
        em2 em2 = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatScreen.n1;
                ul2.c.Z1(em2.a, false);
                return jue;
            case 1:
                k77[] k77Arr2 = ChatScreen.n1;
                ul2.c.P1().b(":call-join-link?link=".concat(em2.c), (Bundle) null);
                return jue;
            default:
                k77[] k77Arr3 = ChatScreen.n1;
                ul2.c.P1().b(wn6.k(new StringBuilder(":call-chat?chat_id="), em2.b, "&video_enabled=false"), (Bundle) null);
                return jue;
        }
    }
}
