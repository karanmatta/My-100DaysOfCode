ThreadGroup in Java
Java provides a convenient way to group multiple threads in a single object. In such a way, we can suspend, resume or interrupt a group of threads by a single method call.

ThreadGroup class is defined in java.lang package. It is a thread container that can also contain other thread groups.
Java thread group is implemented by java.lang.ThreadGroup class.

A ThreadGroup represents a set of threads. A thread group can also include the other thread group. The thread group creates a tree in which every thread group except the initial thread group has a parent.

A thread is allowed to access information about its own thread group, but it cannot access the information about its thread group's parent thread group or any other thread groups.

The java.lang.ThreadGroup class provides constructors and methods to create and perform operations on thread group.

Constructors of ThreadGroup class

ThreadGroup(String name) : creates a new thread group that belongs to the thread group of currently running thread.

ThreadGroup(ThreadGroup parent, String name) : creates a new thread group that belongs to the specified parent thread group.

Methods of ThreadGroup class

int activeCount() : returns the number of threads in this thread group and its subgroups.

int activeGroupCount() : returns the number of thread groups in this thread group and its subgroups.

void checkAccess() : determines if the currently running thread has permission to modify this thread group.

void destroy() : destroys this thread group and all of its subgroups.

int enumerate(Thread list[]) : copies into the specified array every active thread in this thread group and its subgroups.

int enumerate(ThreadGroup list[]) : copies into the specified array every active thread group in this thread group and its subgroups.

int getMaxPriority() : returns the maximum priority of this thread group.

String getName() : returns the name of this thread group.

ThreadGroup getParent() : returns the parent of this thread group.

void interrupt() : interrupts all the threads of this thread group.

boolean isDaemon() : tests if this thread group is a daemon thread group.

boolean isDestroyed() : tests if this thread group has been destroyed.

void list() : prints information about this thread group to the standard output.

void setDaemon(boolean daemon) : marks this thread group as either a daemon thread group or a user thread group.

void setMaxPriority(int pri) : changes the maximum priority of this thread group to the specified new priority.

void stop() : stops all the threads of this thread group.

void suspend() : suspends all the threads of this thread group.

void resume() : resumes all the threads of this thread group.

void uncaughtException(Thread t, Throwable e) : is called whenever a thread in this thread group terminates due to the given uncaught exception.

