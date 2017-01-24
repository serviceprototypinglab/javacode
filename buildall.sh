#!/bin/bash

echo == buttons ==
time (cd buttons; javac Buttons.java >/dev/null)
echo == containers ==
time (cd containers; mvn compile >/dev/null)
echo == imageprocessor ==
time (cd imageprocessor; make compile >/dev/null)
echo == maths ==
time (cd maths; ant dist >/dev/null)
echo == parser ==
time (cd parser; make regenerate compile >/dev/null)
echo == transport ==
time (cd transport/src; make compile >/dev/null)
