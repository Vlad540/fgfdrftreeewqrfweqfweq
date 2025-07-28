package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profileedit.ProfileEditScreen;
import one.me.stickerspreview.StickerPreviewScreen;

/* renamed from: o6b  reason: default package */
public final /* synthetic */ class o6b implements i34 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o6b(long j, ch2 ch2) {
        this.a = 0;
        this.c = ch2;
        this.b = j;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                ch2 ch2 = ch2.ADMIN;
                ch2 ch22 = (ch2) this.c;
                long j = this.b;
                return ch22 == ch2 ? new ChatAdminsScreen(j) : new ChatMembersScreen(j, ch22);
            case 1:
                return new ProfileEditScreen(this.b, (d8b) this.c);
            default:
                Bundle bundle = (Bundle) this.c;
                Long t0 = x87.t0("chat_id", bundle);
                long longValue = t0 != null ? t0.longValue() : 0;
                Long t02 = x87.t0("forward_id", bundle);
                return new StickerPreviewScreen(this.b, longValue, t02 != null ? t02.longValue() : 0);
        }
    }

    public /* synthetic */ o6b(long j, Parcelable parcelable, int i) {
        this.a = i;
        this.b = j;
        this.c = parcelable;
    }
}
