package defpackage;

import android.os.Bundle;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: wo2  reason: default package */
public final class wo2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sg9 b;

    public /* synthetic */ wo2(ChatTitleIconScreen chatTitleIconScreen, sg9 sg9, int i) {
        this.a = i;
        this.b = sg9;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                mpd mpd = (mpd) obj;
                mpd.a2();
                mpd.R1(mpd.Z1(((no2) this.b).b));
                return jue.a;
            case 1:
                mpd mpd2 = (mpd) obj;
                mpd2.a2();
                mpd2.P1().b(us8.j(((mo2) this.b).b, ":profile/edit/link?id=", "&type=local_chat&flow=create"), (Bundle) null);
                return jue.a;
            default:
                mpd mpd3 = (mpd) obj;
                mpd3.a2();
                mpd3.P1().b(us8.i(((lo2) this.b).b, ":start-conversation/add-subscribers?id="), (Bundle) null);
                return jue.a;
        }
    }
}
