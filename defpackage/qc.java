package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: qc  reason: default package */
public final class qc extends Handler {
    public final /* synthetic */ int a = 0;
    public WeakReference b;

    public /* synthetic */ qc() {
    }

    public final void handleMessage(Message message) {
        lb8 lb8;
        Message message2 = message;
        switch (this.a) {
            case 0:
                int i = message2.what;
                if (i == -3 || i == -2 || i == -1) {
                    ((DialogInterface.OnClickListener) message2.obj).onClick((DialogInterface) this.b.get(), message2.what);
                    return;
                } else if (i == 1) {
                    ((DialogInterface) message2.obj).dismiss();
                    return;
                } else {
                    return;
                }
            default:
                s7c s7c = (s7c) this.b.get();
                if (s7c != null) {
                    int i2 = message2.what;
                    int i3 = message2.arg1;
                    int i4 = message2.arg2;
                    Object obj = message2.obj;
                    Bundle peekData = message.peekData();
                    SparseArray sparseArray = s7c.h;
                    v7c v7c = null;
                    x7c x7c = s7c.i;
                    switch (i2) {
                        case 0:
                            if (i3 == s7c.g) {
                                s7c.g = 0;
                                if (x7c.C0 == s7c) {
                                    if (x7c.F0) {
                                        x7c.toString();
                                    }
                                    x7c.l();
                                }
                            }
                            if (((u7c) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (s7c.f == 0 && i3 == s7c.g && i4 >= 1) {
                                    s7c.g = 0;
                                    s7c.f = i4;
                                    pb8 b2 = pb8.b(bundle);
                                    if (x7c.C0 == s7c) {
                                        if (x7c.F0) {
                                            x7c.toString();
                                            Objects.toString(b2);
                                        }
                                        x7c.g(b2);
                                    }
                                    if (x7c.C0 == s7c) {
                                        x7c.D0 = true;
                                        ArrayList arrayList = x7c.z0;
                                        int size = arrayList.size();
                                        for (int i5 = 0; i5 < size; i5++) {
                                            ((t7c) arrayList.get(i5)).b(x7c.C0);
                                        }
                                        va8 va8 = x7c.X;
                                        if (va8 != null) {
                                            s7c s7c2 = x7c.C0;
                                            int i6 = s7c2.d;
                                            s7c2.d = i6 + 1;
                                            s7c2.b(10, i6, 0, va8.a, (Bundle) null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                u7c u7c = (u7c) sparseArray.get(i3);
                                if (u7c != null) {
                                    sparseArray.remove(i3);
                                    u7c.a(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                if (peekData != null) {
                                    peekData.getString("error");
                                }
                                Bundle bundle3 = (Bundle) obj;
                                if (((u7c) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    Objects.toString(bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (s7c.f != 0) {
                                    pb8 b3 = pb8.b(bundle4);
                                    if (x7c.C0 == s7c) {
                                        if (x7c.F0) {
                                            x7c.toString();
                                            Objects.toString(b3);
                                        }
                                        x7c.g(b3);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                u7c u7c2 = (u7c) sparseArray.get(i3);
                                if (bundle5 != null && bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    u7c2.a(bundle5);
                                    break;
                                } else {
                                    u7c2.getClass();
                                    Objects.toString(bundle5);
                                    break;
                                }
                            }
                            break;
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (s7c.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    ta8 ta8 = bundle7 != null ? new ta8(bundle7) : null;
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = parcelableArrayList.iterator();
                                    while (it.hasNext()) {
                                        Bundle bundle8 = (Bundle) it.next();
                                        if (bundle8 == null) {
                                            lb8 = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            lb8 = new lb8(bundle9 != null ? new ta8(bundle9) : null, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(lb8);
                                    }
                                    if (x7c.C0 == s7c) {
                                        if (x7c.F0) {
                                            x7c.toString();
                                            Objects.toString(arrayList2);
                                        }
                                        Iterator it2 = x7c.z0.iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                t7c t7c = (t7c) it2.next();
                                                if (t7c.a() == i4) {
                                                    v7c = t7c;
                                                }
                                            }
                                        }
                                        if (v7c instanceof v7c) {
                                            v7c.l(ta8, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (x7c.C0 == s7c) {
                                ArrayList arrayList3 = x7c.z0;
                                Iterator it3 = arrayList3.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        t7c t7c2 = (t7c) it3.next();
                                        if (t7c2.a() == i4) {
                                            v7c = t7c2;
                                        }
                                    }
                                }
                                ss8 ss8 = x7c.E0;
                                if (ss8 != null && (v7c instanceof nb8)) {
                                    nb8 nb8 = (nb8) v7c;
                                    ub8 ub8 = (ub8) ((y7c) ((ur3) ss8.b).c);
                                    if (ub8.s == nb8) {
                                        ub8.h(ub8.c(), 2);
                                    }
                                }
                                arrayList3.remove(v7c);
                                v7c.c();
                                x7c.m();
                                break;
                            }
                            break;
                    }
                    if (x7c.F0) {
                        message.toString();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public qc(s7c s7c) {
        this.b = new WeakReference(s7c);
    }
}
