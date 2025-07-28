package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: leb  reason: default package */
public final class leb extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public leb(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.Y = profileScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        leb leb = new leb(continuation, this.Y);
        leb.X = obj;
        return leb;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        if (a34 instanceof mdb) {
            kdb kdb = kdb.c;
            long j = ((mdb) a34).b;
            d34 P1 = kdb.P1();
            P1.b(":settings/folder/by-chat?id=" + j, (Bundle) null);
        } else if (a34 instanceof odb) {
            kdb kdb2 = kdb.c;
            long j2 = ((odb) a34).b;
            d34 P12 = kdb2.P1();
            P12.b(":profile/attaches?id=" + j2, (Bundle) null);
        } else if (a34 instanceof vdb) {
            kdb.c.a2(((vdb) a34).b);
        } else if (a34 instanceof ydb) {
            kdb kdb3 = kdb.c;
            long j3 = ((ydb) a34).b;
            d34 P13 = kdb3.P1();
            mn mnVar = new mn(12);
            mnVar.b = ":chats";
            mnVar.T(Long.valueOf(j3), ApiProtocol.KEY_ID);
            mnVar.T("local", "type");
            mnVar.T("true", "open_search_field");
            P13.c(mnVar.u(), (Bundle) null);
        } else if (a34 instanceof pdb) {
            pdb pdb = (pdb) a34;
            kdb.c.d2(pdb.b, pdb.c.a);
        } else {
            boolean z = a34 instanceof udb;
            ProfileScreen profileScreen = this.Y;
            if (z) {
                udb udb = (udb) a34;
                ((iq1) profileScreen.G0.getValue()).e(gq1.PROFILE, udb.d);
                r6b r6b = r6b.CONTACT;
                long j4 = udb.b;
                r6b r6b2 = udb.c;
                boolean z2 = udb.d;
                if (r6b2 == r6b) {
                    profileScreen.m0().l(j4, z2, new uu2(a34, 1));
                } else {
                    String str = udb.e;
                    if (true ^ (str == null || str.length() == 0)) {
                        we1 m0 = profileScreen.m0();
                        if (str != null) {
                            we1.k(m0, str, z2, new uu2(a34, 2));
                        } else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else if (r6b2 == r6b.SERVER_CHAT) {
                        profileScreen.m0().i(j4, z2, new uu2(a34, 3));
                    }
                }
            } else if (a34 instanceof rdb) {
                rdb rdb = (rdb) a34;
                int ordinal = rdb.c.ordinal();
                long j5 = rdb.b;
                if (ordinal == 0) {
                    kdb.c.P1().b(us8.j(j5, ":profile/edit?id=", "&type=local_chat"), (Bundle) null);
                } else if (ordinal == 1) {
                    kdb.c.P1().b(us8.j(j5, ":profile/edit?id=", "&type=server_chat"), (Bundle) null);
                } else if (ordinal == 2) {
                    kdb.c.P1().b(us8.j(j5, ":profile/edit?id=", "&type=contact"), (Bundle) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (hhd.f(a34, xdb.b)) {
                k77[] k77Arr = ProfileScreen.H0;
                if (profileScreen.getRouter().e().size() == 1) {
                    vgc vgc = (vgc) o23.X(profileScreen.getRouter().e());
                    if (hhd.f(vgc != null ? vgc.a : null, profileScreen)) {
                        kdb.c.f2();
                    }
                }
                kdb.c.P1().b(":chat-list", (Bundle) null);
            } else if (a34 instanceof ndb) {
                Context context = profileScreen.getContext();
                Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf(((ndb) a34).b));
                ArrayList arrayList = swb.d;
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(withAppendedPath);
                try {
                    context.startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    udd.s("swb", "viewContact: ", e);
                    a06.E(context, cic.D1);
                }
            } else if (a34 instanceof a34) {
                kdb.c.R1(a34);
            } else if (a34 instanceof ldb) {
                kdb kdb4 = kdb.c;
                ((ldb) a34).getClass();
                kdb4.Z1(0);
            } else if (a34 instanceof tdb) {
                kdb.c.c2(((tdb) a34).b);
            } else if (a34 instanceof qdb) {
                profileScreen.startActivityForResult(((qdb) a34).b, 666);
            } else if (a34 instanceof wdb) {
                ek8.G(profileScreen.getContext(), ((wdb) a34).b);
            } else if (a34 instanceof sdb) {
                kdb.c.P1().b(":external_callback", jjd.j(new wia[]{new wia("params", ((sdb) a34).b)}));
            }
        }
        return jue.a;
    }
}
