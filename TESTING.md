# CONVOS Part 1 - Testing Notes

## POE unit-test data

| Test | Input | Expected |
|---|---|---|
| Valid username | `kyl_1` | True |
| Invalid username | `kyle!!!!!!!` | False |
| Valid password | `Ch&&sec@ke99!` | True |
| Invalid password | `password` | False |
| Valid cell | `+27838968976` | True |
| Invalid cell | `08966553` | False |
| Successful login | `kyl_1` / `Ch&&sec@ke99!` | True |
| Failed login | incorrect details | False |

## My own demonstration

I also included a test using:
- `Shan_5`
- `John@571`
- `+27838968976`

These values are for my demonstration; the POE-required values remain in the unit tests.
