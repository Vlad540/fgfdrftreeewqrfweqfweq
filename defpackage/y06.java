package defpackage;

import java.lang.ref.WeakReference;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.views.fragments.FrgProfilePhoto;

/* renamed from: y06  reason: default package */
public final class y06 implements wq6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ WeakReference o;

    public /* synthetic */ y06(long j, String str, WeakReference weakReference, int i) {
        this.a = i;
        this.b = j;
        this.c = str;
        this.o = weakReference;
    }

    public final void f() {
        switch (this.a) {
            case 0:
                vl.b().r().c(new dk4(this.c, (String) null, this.b, 0));
                return;
            default:
                vl.b().r().c(new dk4(this.c, (String) null, this.b, 0));
                return;
        }
    }

    public final void o() {
        switch (this.a) {
            case 0:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) this.o.get();
                if (frgContactAvatar != null && frgContactAvatar.h1() != null) {
                    frgContactAvatar.r1();
                    return;
                }
                return;
            default:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) this.o.get();
                if (frgProfilePhoto != null && frgProfilePhoto.h1() != null) {
                    frgProfilePhoto.r1();
                    return;
                }
                return;
        }
    }

    public final void p(String str) {
        switch (this.a) {
            case 0:
                vl.b().r().c(new bk4(this.b, 0, "", str, (String) null));
                return;
            default:
                vl.b().r().c(new bk4(this.b, 0, "", str, (String) null));
                return;
        }
    }
}
