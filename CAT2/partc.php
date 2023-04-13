
<?php
function encryptCaesarCipher($plaintext, $key) {
  $ciphertext = "";
  $plaintext = strtoupper($plaintext); //For simplicity we'll take it as upper case.
  $alphabet = range('A', 'Z'); // Create an array of alphabets
  
  for ($i = 0; $i < strlen($plaintext); $i++) {
    $char = $plaintext[$i];
    if (in_array($char, $alphabet)) { // Only encrypt letters in the alphabet
      $charIndex = array_search($char, $alphabet);
      $newIndex = ($charIndex + $key) % 26;
      $ciphertext .= $alphabet[$newIndex];
    } else {
      $ciphertext .= $char; // Keep non-alphabetic characters the same
    }
  }
  
  return $ciphertext;
}

// Prompt user for input
echo "Enter plaintext to encrypt: ";
$plaintext = trim(fgets(STDIN));
echo "Enter key to use for encryption (integer): ";
$key = intval(trim(fgets(STDIN)));

// Encrypt the plaintext using the given key
$ciphertext = encryptCaesarCipher($plaintext, $key);

// Output the encrypted ciphertext
echo "Ciphertext: " . $ciphertext;

?>
