package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.settings.MessagesSettingsScreen;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;

/* renamed from: be8  reason: default package */
public final /* synthetic */ class be8 implements nf3, le8, e26, of3, j26, otc, so6, to6, j75, k75 {
    public final /* synthetic */ int a;

    public /* synthetic */ be8(int i) {
        this.a = i;
    }

    public d75[] a() {
        return new d75[]{new p79()};
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((qza) obj).prepare();
                return;
            case 1:
                ((qza) obj).E();
                return;
            case 3:
                ((qza) obj).v();
                return;
            case 10:
                Drawable drawable = mn8.Z0;
                udd.s("mn8", "Can't save file", (Throwable) obj);
                return;
            case 12:
                p10 p10 = (p10) obj;
                for (int i = 0; i < p10.b(); i++) {
                    m00 j = p10.d(i).j();
                    j.i = g10.a;
                    j.k = 0.0f;
                    p10.e(i, j.a());
                }
                return;
            case 13:
                udd.s("to8", "cancelUploadAttachAcync: failed", (Throwable) obj);
                return;
            case 14:
                m00 m00 = (m00) obj;
                m00.k = 0.0f;
                m00.o = 0;
                m00.p = 0;
                return;
            case 28:
                ((m00) obj).i = g10.c;
                return;
            default:
                Throwable th = (Throwable) obj;
                udd.r("fd9", "Can't hide controls");
                return;
        }
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 7:
                return Long.valueOf(((xw3) obj).b);
            case 8:
                return Long.valueOf(((xw3) obj).c);
            case 9:
                return ws6.j(jjd.S(new kce(19), ((s88) obj).p().b));
            case 11:
                return String.valueOf((Long) obj);
            case 15:
                et8 et8 = (et8) obj;
                et8.getClass();
                return new ox7(new dt8(et8, pec.a(0, "SELECT * FROM message_uploads"), 0));
            case 16:
                return r1g.u((at8) obj);
            case 17:
                List list = (List) obj;
                return list.isEmpty() ? hx7.a : ax7.e(list);
            case 18:
                List list2 = (List) obj;
                return list2.isEmpty() ? hx7.a : ax7.e(list2);
            case 19:
                et8 et82 = (et8) obj;
                et82.getClass();
                return new y63(2, new g74(7, et82));
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return ((OneMeRoomDatabase) obj).E();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return (moe) obj;
            default:
                return (noe) obj;
        }
    }

    public boolean c(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case 22:
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
            default:
                return (i2 == 67 && i3 == 79 && i4 == 77 && (i5 == 77 || i == 2)) || (i2 == 77 && i3 == 76 && i4 == 76 && (i5 == 84 || i == 2));
        }
    }

    public void e(qza qza, jc8 jc8) {
        am7.B(qza, jc8);
    }

    public Object h(cd8 cd8, ic8 ic8, int i) {
        switch (this.a) {
            case 2:
                hr1.r(cd8);
                throw null;
            case 4:
                hr1.r(cd8);
                throw null;
            default:
                cd8.s(ic8);
                cd8.e.getClass();
                return swb.A(new p2d(-6));
        }
    }

    public int i(int i) {
        k77[] k77Arr = MessagesSettingsScreen.Y;
        return 4;
    }

    /* renamed from: a  reason: collision with other method in class */
    public e75[] m11a() {
        return new e75[]{new q79(16, s1e.W)};
    }
}
