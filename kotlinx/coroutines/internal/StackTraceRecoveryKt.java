package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000^\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001d\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a.\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\b¢\u0006\u0004\b\u0003\u0010\b\u001a-\u0010\u000b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\n\u0010\u0007\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a;\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u00002\u0010\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014\u001a3\u0010\u0017\u001a\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u00160\u0015\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a3\u0010\u001b\u001a\u00020\u001a2\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u00162\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0000HH¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010 \u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\b¢\u0006\u0004\b \u0010\u0004\u001a!\u0010!\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0001¢\u0006\u0004\b!\u0010\u0004\u001a%\u0010\"\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u000f2\n\u0010\u0007\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\"\u0010#\u001a\u0017\u0010%\u001a\u00020$*\u00060\u0010j\u0002`\u0011H\u0000¢\u0006\u0004\b%\u0010&\u001a%\u0010*\u001a\u00020)*\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110\u00162\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b*\u0010+\u001a#\u0010-\u001a\u00020$*\u00060\u0010j\u0002`\u00112\n\u0010,\u001a\u00060\u0010j\u0002`\u0011H\u0002¢\u0006\u0004\b-\u0010.\u001a\u001b\u0010/\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0000H\u0000¢\u0006\u0004\b/\u00100\"\u0014\u00101\u001a\u00020'8\u0002XT¢\u0006\u0006\n\u0004\b1\u00102\"\u0014\u00103\u001a\u00020'8\u0002XT¢\u0006\u0006\n\u0004\b3\u00102\"\u0014\u00104\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105\"\u001c\u00107\u001a\n 6*\u0004\u0018\u00010'0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00102\"\u001c\u00108\u001a\n 6*\u0004\u0018\u00010'0'8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00102*\f\b\u0000\u00109\"\u00020\t2\u00020\t*\f\b\u0000\u0010:\"\u00020\u00102\u00020\u0010¨\u0006;"}, d2 = {"", "E", "exception", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "sanitizeStackTrace", "Lkotlin/coroutines/Continuation;", "continuation", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "Lqu3;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lqu3;)Ljava/lang/Throwable;", "cause", "result", "Ljava/util/ArrayDeque;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "resultStackTrace", "createFinalException", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "Lwia;", "", "causeAndStacktrace", "(Ljava/lang/Throwable;)Lwia;", "recoveredStacktrace", "Ljue;", "mergeRecoveredTraces", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "", "recoverAndThrow", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unwrap", "unwrapImpl", "createStackTrace", "(Lqu3;)Ljava/util/ArrayDeque;", "", "isArtificial", "(Ljava/lang/StackTraceElement;)Z", "", "methodName", "", "firstFrameIndex", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "e", "elementWiseEquals", "(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z", "initCause", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)V", "baseContinuationImplClass", "Ljava/lang/String;", "stackTraceRecoveryClass", "ARTIFICIAL_FRAME", "Ljava/lang/StackTraceElement;", "kotlin.jvm.PlatformType", "baseContinuationImplClassName", "stackTraceRecoveryClassName", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
public final class StackTraceRecoveryKt {
    private static final StackTraceElement ARTIFICIAL_FRAME = ete.b(new Exception(), gwf.class.getSimpleName());
    private static final String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final String baseContinuationImplClassName;
    private static final String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final String stackTraceRecoveryClassName;

    static {
        Object obj;
        Object obj2;
        try {
            obj = bh0.class.getCanonicalName();
        } catch (Throwable th) {
            obj = new kcc(th);
        }
        if (mcc.a(obj) != null) {
            obj = baseContinuationImplClass;
        }
        baseContinuationImplClassName = (String) obj;
        try {
            obj2 = StackTraceRecoveryKt.class.getCanonicalName();
        } catch (Throwable th2) {
            obj2 = new kcc(th2);
        }
        if (mcc.a(obj2) != null) {
            obj2 = stackTraceRecoveryClass;
        }
        stackTraceRecoveryClassName = (String) obj2;
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
    }

    private static final <E extends Throwable> wia causeAndStacktrace(E e) {
        wia wia;
        Throwable cause = e.getCause();
        if (cause == null || !cause.getClass().equals(e.getClass())) {
            wia = new wia(e, new StackTraceElement[0]);
        } else {
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement isArtificial : stackTrace) {
                if (isArtificial(isArtificial)) {
                    return new wia(cause, stackTrace);
                }
            }
            wia = new wia(e, new StackTraceElement[0]);
        }
        return wia;
    }

    private static final <E extends Throwable> E createFinalException(E e, E e2, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(ARTIFICIAL_FRAME);
        StackTraceElement[] stackTrace = e.getStackTrace();
        int firstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i = 0;
        if (firstFrameIndex == -1) {
            e2.setStackTrace((StackTraceElement[]) arrayDeque.toArray(new StackTraceElement[0]));
            return e2;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[(arrayDeque.size() + firstFrameIndex)];
        for (int i2 = 0; i2 < firstFrameIndex; i2++) {
            stackTraceElementArr[i2] = stackTrace[i2];
        }
        for (StackTraceElement stackTraceElement : arrayDeque) {
            stackTraceElementArr[i + firstFrameIndex] = stackTraceElement;
            i++;
        }
        e2.setStackTrace(stackTraceElementArr);
        return e2;
    }

    private static final ArrayDeque<StackTraceElement> createStackTrace(qu3 qu3) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = qu3.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            qu3 = qu3.getCallerFrame();
            if (qu3 == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = qu3.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean elementWiseEquals(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && hhd.f(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && hhd.f(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && hhd.f(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int firstFrameIndex(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i = 0; i < length; i++) {
            if (hhd.f(str, stackTraceElementArr[i].getClassName())) {
                return i;
            }
        }
        return -1;
    }

    public static final void initCause(Throwable th, Throwable th2) {
        th.initCause(th2);
    }

    public static final boolean isArtificial(StackTraceElement stackTraceElement) {
        return p0e.Q(stackTraceElement.getClassName(), "_COROUTINE", false);
    }

    private static final void mergeRecoveredTraces(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (isArtificial(stackTraceElementArr[i])) {
                break;
            } else {
                i++;
            }
        }
        int i2 = i + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i2 <= length2) {
            while (true) {
                if (elementWiseEquals(stackTraceElementArr[length2], arrayDeque.getLast())) {
                    arrayDeque.removeLast();
                }
                arrayDeque.addFirst(stackTraceElementArr[length2]);
                if (length2 != i2) {
                    length2--;
                } else {
                    return;
                }
            }
        }
    }

    public static final Object recoverAndThrow(Throwable th, Continuation<?> continuation) {
        throw th;
    }

    private static final Object recoverAndThrow$$forInline(Throwable th, Continuation<?> continuation) {
        throw th;
    }

    /* access modifiers changed from: private */
    public static final <E extends Throwable> E recoverFromStackFrame(E e, qu3 qu3) {
        wia causeAndStacktrace = causeAndStacktrace(e);
        E e2 = (Throwable) causeAndStacktrace.a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) causeAndStacktrace.b;
        Throwable tryCopyException = ExceptionsConstructorKt.tryCopyException(e2);
        if (tryCopyException == null) {
            return e;
        }
        ArrayDeque createStackTrace = createStackTrace(qu3);
        if (createStackTrace.isEmpty()) {
            return e;
        }
        if (e2 != e) {
            mergeRecoveredTraces(stackTraceElementArr, createStackTrace);
        }
        return createFinalException(e2, tryCopyException, createStackTrace);
    }

    public static final <E extends Throwable> E recoverStackTrace(E e) {
        return e;
    }

    private static final <E extends Throwable> E sanitizeStackTrace(E e) {
        StackTraceElement[] stackTrace = e.getStackTrace();
        int length = stackTrace.length;
        int length2 = stackTrace.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i = length2 - 1;
                if (hhd.f(stackTraceRecoveryClassName, stackTrace[length2].getClassName())) {
                    break;
                } else if (i < 0) {
                    break;
                } else {
                    length2 = i;
                }
            }
        }
        length2 = -1;
        int i2 = length2 + 1;
        int firstFrameIndex = firstFrameIndex(stackTrace, baseContinuationImplClassName);
        int i3 = 0;
        int i4 = (length - length2) - (firstFrameIndex == -1 ? 0 : length - firstFrameIndex);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i4];
        while (i3 < i4) {
            stackTraceElementArr[i3] = i3 == 0 ? ARTIFICIAL_FRAME : stackTrace[(i2 + i3) - 1];
            i3++;
        }
        e.setStackTrace(stackTraceElementArr);
        return e;
    }

    public static final <E extends Throwable> E unwrap(E e) {
        return e;
    }

    public static final <E extends Throwable> E unwrapImpl(E e) {
        E cause = e.getCause();
        if (cause != null && cause.getClass().equals(e.getClass())) {
            for (StackTraceElement isArtificial : e.getStackTrace()) {
                if (isArtificial(isArtificial)) {
                    return cause;
                }
            }
        }
        return e;
    }

    public static final <E extends Throwable> E recoverStackTrace(E e, Continuation<?> continuation) {
        return e;
    }
}
