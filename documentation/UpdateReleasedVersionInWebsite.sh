#!/bin/bash
if [[ "$1" == *"SNAPSHOT" ]]; then
  echo "IGNORING version in documentation website: $1"
else
  echo "Setting version in documentation website: $1"
  echo -n ${1} > ./layouts/shortcodes/YauaaVersion.md
  git add ./layouts/shortcodes/YauaaVersion.md
fi
exit 0
