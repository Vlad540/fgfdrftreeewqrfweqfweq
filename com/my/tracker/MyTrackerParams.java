package com.my.tracker;

import android.text.TextUtils;
import com.my.tracker.obfuscated.b1;
import com.my.tracker.obfuscated.g;
import com.my.tracker.obfuscated.n;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class MyTrackerParams {
    final List a = new ArrayList();
    final Object b = new Object();
    volatile b1 c = b1.j;
    final Map d = new ConcurrentHashMap();
    volatile String e = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Gender {
        public static final int FEMALE = 2;
        public static final int MALE = 1;
        public static final int UNKNOWN = 0;
        public static final int UNSPECIFIED = -1;
    }

    public static class a {
        public final String a;
        public final Map b;

        public a(String str, Map map) {
            this.a = str;
            this.b = new HashMap(map);
        }
    }

    private static String[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new String[]{str};
    }

    private static String b(String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public int getAge() {
        return this.c.a;
    }

    public String getCustomParam(String str) {
        return (String) this.d.get(str.toLowerCase(Locale.ROOT));
    }

    public String getCustomUserId() {
        return b(this.c.g);
    }

    public String[] getCustomUserIds() {
        return a(this.c.g);
    }

    public String getEmail() {
        return b(this.c.e);
    }

    public String[] getEmails() {
        return a(this.c.e);
    }

    public int getGender() {
        return this.c.b;
    }

    public String getIcqId() {
        return b(this.c.f);
    }

    public String[] getIcqIds() {
        return a(this.c.f);
    }

    public String getLang() {
        return this.e;
    }

    public String getOkId() {
        return b(this.c.c);
    }

    public String[] getOkIds() {
        return a(this.c.c);
    }

    public String getPhone() {
        return b(this.c.h);
    }

    public String[] getPhones() {
        return a(this.c.h);
    }

    public String getVkConnectId() {
        return b(this.c.i);
    }

    public String[] getVkConnectIds() {
        return a(this.c.i);
    }

    public String getVkId() {
        return b(this.c.d);
    }

    public String[] getVkIds() {
        return a(this.c.d);
    }

    public MyTrackerParams setAge(int i) {
        synchronized (this.b) {
            try {
                if (this.c.a != i) {
                    b1 b1Var = new b1(i, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setCustomParam(String str, String str2) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (str2 == null) {
            this.d.remove(lowerCase);
            return this;
        }
        this.d.put(lowerCase, str2);
        return this;
    }

    public MyTrackerParams setCustomUserId(String str) {
        return setCustomUserIds(a(str));
    }

    public MyTrackerParams setCustomUserIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (g.a(this.c.g, strArr) != 0) {
                    b1 b1Var = new b1(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, a2, this.c.h, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setEmail(String str) {
        return setEmails(a(str));
    }

    public MyTrackerParams setEmails(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (g.a(this.c.e, strArr) != 0) {
                    b1 b1Var = new b1(this.c.a, this.c.b, this.c.c, this.c.d, a2, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setGender(int i) {
        synchronized (this.b) {
            try {
                if (this.c.b != i) {
                    b1 b1Var = new b1(this.c.a, i, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setIcqId(String str) {
        return setIcqIds(a(str));
    }

    public MyTrackerParams setIcqIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (g.a(this.c.f, strArr) != 0) {
                    b1 b1Var = new b1(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, a2, this.c.g, this.c.h, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setLang(String str) {
        this.e = str;
        return this;
    }

    public MyTrackerParams setOkId(String str) {
        return setOkIds(a(str));
    }

    public MyTrackerParams setOkIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (g.a(this.c.c, strArr) != 0) {
                    b1 b1Var = new b1(this.c.a, this.c.b, a2, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setPhone(String str) {
        return setPhones(a(str));
    }

    public MyTrackerParams setPhones(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (g.a(this.c.h, strArr) != 0) {
                    b1 b1Var = new b1(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, a2, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setVkConnectId(String str) {
        return setVkConnectIds(a(str));
    }

    public MyTrackerParams setVkConnectIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (g.a(this.c.i, strArr) != 0) {
                    b1 b1Var = new b1(this.c.a, this.c.b, this.c.c, this.c.d, this.c.e, this.c.f, this.c.g, this.c.h, a2);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    public MyTrackerParams setVkId(String str) {
        return setVkIds(a(str));
    }

    public MyTrackerParams setVkIds(String[] strArr) {
        synchronized (this.b) {
            try {
                String[] a2 = a(strArr);
                if (g.a(this.c.d, strArr) != 0) {
                    b1 b1Var = new b1(this.c.a, this.c.b, this.c.c, a2, this.c.e, this.c.f, this.c.g, this.c.h, this.c.i);
                    a(b1Var);
                    this.c = b1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this;
    }

    private static String[] a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    public void a(n nVar, n nVar2) {
        synchronized (this.b) {
            synchronized (this.a) {
                nVar.a(this.c);
                this.a.add(nVar2);
            }
        }
    }

    private void a(b1 b1Var) {
        synchronized (this.a) {
            try {
                for (n a2 : this.a) {
                    a2.a(b1Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public a a() {
        return new a(this.e, this.d);
    }
}
