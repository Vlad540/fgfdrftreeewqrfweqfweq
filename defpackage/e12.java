package defpackage;

import android.view.View;
import kotlinx.coroutines.internal.ExceptionsConstructorKt;
import one.me.members.list.MembersListWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;

/* renamed from: e12  reason: default package */
public final /* synthetic */ class e12 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ e12(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public final Object invoke(Object obj) {
        boolean z = false;
        jue jue = jue.a;
        u16 u16 = this.b;
        switch (this.a) {
            case 0:
                u16.invoke((CharSequence) obj);
                return jue;
            case 1:
                u16.invoke((String) obj);
                return jue;
            case 2:
                return ExceptionsConstructorKt.b(u16, (Throwable) obj);
            case 3:
                Integer num = (Integer) obj;
                num.intValue();
                k77[] k77Arr = MembersListWidget.H0;
                if (((ei8) u16.invoke(num)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                Integer num2 = (Integer) obj;
                num2.intValue();
                k77[] k77Arr2 = MembersListWidget.H0;
                ei8 ei8 = (ei8) u16.invoke(num2);
                if (ei8 != null) {
                    z = ei8.z0;
                }
                return Boolean.valueOf(z);
            case 5:
                k77[] k77Arr3 = ProfileChangeLinkScreen.z0;
                u16.invoke((View) obj);
                return jue;
            default:
                k77[] k77Arr4 = ProfileChangeLinkScreen.z0;
                u16.invoke((View) obj);
                return jue;
        }
    }
}
