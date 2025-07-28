package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import one.me.profile.ProfileScreen;

/* renamed from: oeb  reason: default package */
public final /* synthetic */ class oeb implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ ncb b;
    public final /* synthetic */ seb c;

    public /* synthetic */ oeb(ncb ncb, seb seb) {
        this.b = ncb;
        this.c = seb;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ProfileScreen profileScreen = (ProfileScreen) this.c.X;
                profileScreen.getClass();
                StringBuilder sb = new StringBuilder("ID #");
                long j = ((icb) this.b).a;
                String k = wn6.k(sb, j, " скопирован в буфер обмена");
                ((ClipboardManager) profileScreen.requireActivity().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(k, String.valueOf(j)));
                hba hba = (hba) i6b.a.getAccessor().d(hba.class).getValue();
                hba.i(k);
                hba.e(2);
                hba.j();
                return;
            default:
                long j2 = ((fcb) this.b).a.a;
                ((ProfileScreen) this.c.X).getClass();
                kdb.c.a2(j2);
                return;
        }
    }

    public /* synthetic */ oeb(seb seb, ncb ncb) {
        this.c = seb;
        this.b = ncb;
    }
}
