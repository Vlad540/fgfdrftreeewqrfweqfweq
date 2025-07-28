package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.profile.screens.avatars.ContactAvatarsScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.activity.ActivityWrapperWidget;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: m6b  reason: default package */
public final /* synthetic */ class m6b implements i34 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Enum c;
    public final /* synthetic */ Object o;

    public /* synthetic */ m6b(long j, d8b d8b, c8b c8b) {
        this.b = j;
        this.c = d8b;
        this.o = c8b;
    }

    public final Object a() {
        switch (this.a) {
            case 0:
                int ordinal = ((r6b) this.c).ordinal();
                long j = this.b;
                if (ordinal == 0) {
                    String b2 = m7c.a(ActProfilePhoto.class).b();
                    if (b2 != null) {
                        return new ActivityWrapperWidget(b2, new je2(j, 3));
                    }
                    throw new IllegalArgumentException("Required value was null.".toString());
                } else if (ordinal == 1) {
                    return jue.a;
                } else {
                    if (ordinal == 2) {
                        kb5 kb5 = (kb5) ((jb5) ((q6b) this.o).b.getValue());
                        kb5.getClass();
                        if (kb5.m(PmsKey.f7avatarsscreenenabled, false)) {
                            return new ContactAvatarsScreen(j);
                        }
                        String b3 = m7c.a(ActContactAvatars.class).b();
                        if (b3 != null) {
                            return new ActivityWrapperWidget(b3, new je2(j, 4));
                        }
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            default:
                return new ProfileChangeLinkScreen(this.b, (d8b) this.c, (c8b) this.o);
        }
    }

    public /* synthetic */ m6b(r6b r6b, q6b q6b, long j) {
        this.c = r6b;
        this.o = q6b;
        this.b = j;
    }
}
