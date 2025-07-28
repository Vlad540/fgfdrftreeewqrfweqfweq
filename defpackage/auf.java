package defpackage;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* renamed from: auf  reason: default package */
public final class auf implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pec b;
    public final /* synthetic */ Object c;

    public /* synthetic */ auf(Object obj, pec pec, int i) {
        this.a = i;
        this.c = obj;
        this.b = pec;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [kgd, yr] */
    /* JADX WARNING: type inference failed for: r10v0, types: [kgd, yr] */
    /* JADX WARNING: type inference failed for: r10v7, types: [b3f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v11, types: [c3f, java.lang.Object] */
    public final Object call() {
        Cursor o;
        Throwable th;
        switch (this.a) {
            case 0:
                buf buf = (buf) this.c;
                aec aec = (aec) buf.a;
                aec.c();
                try {
                    o = aec.o(this.b, (CancellationSignal) null);
                    if (o instanceof AbstractWindowedCursor) {
                        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) o;
                        int count = abstractWindowedCursor.getCount();
                        if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                            try {
                                MatrixCursor matrixCursor = new MatrixCursor(o.getColumnNames(), o.getCount());
                                while (o.moveToNext()) {
                                    Object[] objArr = new Object[o.getColumnCount()];
                                    int columnCount = o.getColumnCount();
                                    for (int i = 0; i < columnCount; i++) {
                                        int type = o.getType(i);
                                        if (type == 0) {
                                            objArr[i] = null;
                                        } else if (type == 1) {
                                            objArr[i] = Long.valueOf(o.getLong(i));
                                        } else if (type == 2) {
                                            objArr[i] = Double.valueOf(o.getDouble(i));
                                        } else if (type == 3) {
                                            objArr[i] = o.getString(i);
                                        } else if (type == 4) {
                                            objArr[i] = o.getBlob(i);
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    }
                                    matrixCursor.addRow(objArr);
                                }
                                urd.l(o, (Throwable) null);
                                o = matrixCursor;
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                urd.l(o, th);
                                throw th3;
                            }
                        }
                    }
                    ? kgd = new kgd(0);
                    ? kgd2 = new kgd(0);
                    while (o.moveToNext()) {
                        String string = o.getString(0);
                        if (((ArrayList) kgd.get(string)) == null) {
                            kgd.put(string, new ArrayList());
                        }
                        String string2 = o.getString(0);
                        if (((ArrayList) kgd2.get(string2)) == null) {
                            kgd2.put(string2, new ArrayList());
                        }
                    }
                    o.moveToPosition(-1);
                    buf.b(kgd);
                    buf.a(kgd2);
                    ArrayList arrayList = new ArrayList(o.getCount());
                    while (o.moveToNext()) {
                        String string3 = o.isNull(0) ? null : o.getString(0);
                        ctf t = wx3.t(o.getInt(1));
                        zy3 a2 = zy3.a(o.isNull(2) ? null : o.getBlob(2));
                        int i2 = o.getInt(3);
                        int i3 = o.getInt(4);
                        ArrayList arrayList2 = (ArrayList) kgd.get(o.getString(0));
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                        }
                        ArrayList arrayList3 = arrayList2;
                        ArrayList arrayList4 = (ArrayList) kgd2.get(o.getString(0));
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList.add(new ytf(string3, t, a2, i2, i3, arrayList3, arrayList4));
                    }
                    aec.r();
                    o.close();
                    aec.l();
                    return arrayList;
                } catch (Throwable th4) {
                    aec.l();
                    throw th4;
                }
            default:
                Object obj = null;
                Cursor o2 = ((e3f) this.c).a.o(this.b, (CancellationSignal) null);
                try {
                    int o3 = gp0.o(o2, "finished");
                    int o4 = gp0.o(o2, "prepared_path");
                    int o5 = gp0.o(o2, "result_path");
                    int o6 = gp0.o(o2, "source_uri");
                    int o7 = gp0.o(o2, "quality");
                    int o8 = gp0.o(o2, "start_trim_position");
                    int o9 = gp0.o(o2, "end_trim_position");
                    int o10 = gp0.o(o2, "mute");
                    if (o2.moveToFirst()) {
                        ? obj2 = new Object();
                        if (o2.isNull(o6)) {
                            obj2.a = null;
                        } else {
                            obj2.a = o2.getString(o6);
                        }
                        obj2.b = qjb.values()[(o2.isNull(o7) ? null : Integer.valueOf(o2.getInt(o7))).intValue()];
                        obj2.c = o2.getFloat(o8);
                        obj2.d = o2.getFloat(o9);
                        boolean z = false;
                        obj2.e = o2.getInt(o10) != 0;
                        ? obj3 = new Object();
                        if (o2.getInt(o3) != 0) {
                            z = true;
                        }
                        obj3.b = z;
                        if (o2.isNull(o4)) {
                            obj3.c = null;
                        } else {
                            obj3.c = o2.getString(o4);
                        }
                        if (o2.isNull(o5)) {
                            obj3.d = null;
                        } else {
                            obj3.d = o2.getString(o5);
                        }
                        obj3.a = obj2;
                        obj = obj3;
                    }
                    o2.close();
                    return obj;
                } catch (Throwable th5) {
                    o2.close();
                    throw th5;
                }
        }
    }

    public final void finalize() {
        switch (this.a) {
            case 0:
                this.b.m();
                return;
            default:
                this.b.m();
                return;
        }
    }
}
