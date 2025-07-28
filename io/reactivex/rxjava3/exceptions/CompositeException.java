package io.reactivex.rxjava3.exceptions;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

public final class CompositeException extends RuntimeException {
    public final List a;
    public final String b;
    public Throwable c;

    public CompositeException(Throwable... thArr) {
        this(Arrays.asList(thArr));
    }

    public static void a(gt0 gt0, Throwable th, String str) {
        gt0.c(str).c(th).c(10);
        for (StackTraceElement c2 : th.getStackTrace()) {
            gt0.c("\t\tat ").c(c2).c(10);
        }
        if (th.getCause() != null) {
            gt0.c("\tCaused by: ");
            a(gt0, th.getCause(), BuildConfig.FLAVOR);
        }
    }

    public final void b(gt0 gt0) {
        gt0.c(this).c("\n");
        for (StackTraceElement c2 : getStackTrace()) {
            gt0.c("\tat ").c(c2).c("\n");
        }
        int i = 1;
        for (Throwable a2 : this.a) {
            gt0.c("  ComposedException ").c(Integer.valueOf(i)).c(" :\n");
            a(gt0, a2, "\t");
            i++;
        }
        gt0.c("\n");
    }

    public final synchronized Throwable getCause() {
        int i;
        try {
            if (this.c == null) {
                String property = System.getProperty("line.separator");
                if (this.a.size() > 1) {
                    IdentityHashMap identityHashMap = new IdentityHashMap();
                    StringBuilder sb = new StringBuilder();
                    sb.append("Multiple exceptions (");
                    sb.append(this.a.size());
                    sb.append(")");
                    sb.append(property);
                    for (Throwable th : this.a) {
                        int i2 = 0;
                        while (true) {
                            if (th == null) {
                                break;
                            }
                            for (int i3 = 0; i3 < i2; i3++) {
                                sb.append("  ");
                            }
                            sb.append("|-- ");
                            sb.append(th.getClass().getCanonicalName());
                            sb.append(": ");
                            String message = th.getMessage();
                            if (message == null || !message.contains(property)) {
                                sb.append(message);
                                sb.append(property);
                            } else {
                                sb.append(property);
                                for (String str : message.split(property)) {
                                    for (int i4 = 0; i4 < i2 + 2; i4++) {
                                        sb.append("  ");
                                    }
                                    sb.append(str);
                                    sb.append(property);
                                }
                            }
                            int i5 = 0;
                            while (true) {
                                i = i2 + 2;
                                if (i5 >= i) {
                                    break;
                                }
                                sb.append("  ");
                                i5++;
                            }
                            StackTraceElement[] stackTrace = th.getStackTrace();
                            if (stackTrace.length > 0) {
                                sb.append("at ");
                                sb.append(stackTrace[0]);
                                sb.append(property);
                            }
                            if (!identityHashMap.containsKey(th)) {
                                identityHashMap.put(th, Boolean.TRUE);
                                th = th.getCause();
                                i2++;
                            } else {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    for (int i6 = 0; i6 < i; i6++) {
                                        sb.append("  ");
                                    }
                                    sb.append("|-- ");
                                    sb.append("(cause not expanded again) ");
                                    sb.append(cause.getClass().getCanonicalName());
                                    sb.append(": ");
                                    sb.append(cause.getMessage());
                                    sb.append(property);
                                }
                            }
                        }
                    }
                    this.c = new o83(sb.toString().trim(), 0);
                } else {
                    this.c = (Throwable) this.a.get(0);
                }
            }
        } finally {
            while (true) {
            }
        }
        return this.c;
    }

    public final String getMessage() {
        return this.b;
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final void printStackTrace(PrintStream printStream) {
        b(new p83(0, printStream));
    }

    public CompositeException(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                if (th instanceof CompositeException) {
                    linkedHashSet.addAll(((CompositeException) th).a);
                } else if (th != null) {
                    linkedHashSet.add(th);
                } else {
                    linkedHashSet.add(new NullPointerException("Throwable was null!"));
                }
            }
        } else {
            linkedHashSet.add(new NullPointerException("errors was null"));
        }
        if (!linkedHashSet.isEmpty()) {
            List unmodifiableList = Collections.unmodifiableList(new ArrayList(linkedHashSet));
            this.a = unmodifiableList;
            this.b = unmodifiableList.size() + " exceptions occurred. ";
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }

    public final void printStackTrace(PrintWriter printWriter) {
        b(new p83(1, printWriter));
    }
}
