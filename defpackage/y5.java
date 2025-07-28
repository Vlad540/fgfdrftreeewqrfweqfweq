package defpackage;

import java.io.Serializable;
import ru.ok.messages.contacts.profile.ActContactAvatars;

/* renamed from: y5  reason: default package */
public final /* synthetic */ class y5 implements j6 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;

    public /* synthetic */ y5(zo0 zo0, long j, ap0 ap0) {
        this.c = zo0;
        this.b = j;
        this.d = ap0;
    }

    public final void run() {
        long j = this.b;
        Serializable serializable = this.d;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                int i = ActContactAvatars.l1;
                String str = (String) serializable;
                ((di3) ((k93) ((ActContactAvatars) obj).O0.b).getAccessor().c(di3.class)).d(j, str, str);
                return;
            default:
                zo0 zo0 = (zo0) obj;
                zo0.getClass();
                ap0 ap0 = (ap0) serializable;
                boolean J = ek8.J(ap0.a);
                bf5 bf5 = zo0.a;
                if (J) {
                    try {
                        ((mg5) bf5).e(j).delete();
                        return;
                    } catch (Exception unused) {
                        udd.p("zo0", "deleteBotCommandsForChat: exception when delete botCommands for, chatId = %d", new Object[]{Long.valueOf(j)});
                        return;
                    }
                } else if (!lp.Q(((mg5) bf5).e(j), ap0)) {
                    udd.p("zo0", "Failed to store botCommands, chatId = %d", new Object[]{Long.valueOf(j)});
                    return;
                } else {
                    return;
                }
        }
    }

    public /* synthetic */ y5(ActContactAvatars actContactAvatars, String str, long j) {
        this.c = actContactAvatars;
        this.d = str;
        this.b = j;
    }
}
