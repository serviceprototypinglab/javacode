#!/bin/bash

echo == buttons ==
time (cd buttons; java Buttons)
echo == containers ==
time (cd containers; mvn exec:java)
echo == imageprocessor ==
time (cd imageprocessor; make run)
echo == maths ==
time (cd maths; ant run)
echo == parser ==
time (cd parser; make run)
echo == transport ==
time (cd transport/src; make run)
